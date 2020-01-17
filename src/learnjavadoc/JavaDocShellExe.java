package learnjavadoc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaDocShellExe {

    private Runtime rtHandler;
    JavaDocShellExe() throws NullPointerException{
        this.rtHandler = Runtime.getRuntime();
        if (this.rtHandler == null)
            throw new NullPointerException("Fail get runtime instance");
    }

    public StringBuffer exec(String[] cmd){
        Process process = null;
        StringBuffer sb = new StringBuffer(8196);
        try{
            process = this.rtHandler.exec(cmd);
            BufferedReader out = new BufferedReader(new InputStreamReader(process.getInputStream()));
            PrintWriter in = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
            String tmp;
            while ((tmp = out.readLine()) != null){
                sb.append(tmp);
            }
            out.close();
            in.close();
            process.destroy();
        }catch (IOException e){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,null,e);
        }
        return sb;
    }

    public Runtime getRtHandler() {
        return rtHandler;
    }

    public void setRtHandler(Runtime rtHandler) {
        this.rtHandler = rtHandler;
    }
}
