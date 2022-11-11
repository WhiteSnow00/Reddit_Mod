// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import java.io.FileOutputStream;
import java.io.File;
import org.json.JSONObject;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public final class 0Qi implements Runnable
{
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Context LIZJ;
    
    static {
        Covode.recordClassIndex(4350);
    }
    
    public 0Qi(final String liz, final String liziz, final Context lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        MethodCollector.i(53);
        try {
            0Ql.LIZJ = this.LIZ;
            0Ql.LIZIZ = this.LIZIZ;
            Object o = 0Ql.LIZ(this.LIZIZ);
            String s = this.LIZ;
            final Context lizj = this.LIZJ;
            final StringBuffer sb = new StringBuffer();
            Object liz = null;
        Label_0142_Outer:
            while (true) {
            Label_0142:
                while (true) {
                    Object liz2;
                    try {
                        final Object string = new FileReader(s);
                        liz2 = new BufferedReader((Reader)string);
                        while (true) {
                            liz = liz2;
                            try {
                                final Object o2 = liz2;
                                s = ((BufferedReader)o2).readLine();
                                liz = liz2;
                                final String s2 = s;
                                if (s2 != null) {
                                    liz = liz2;
                                    final StringBuffer sb2 = sb;
                                    final String s3 = s;
                                    sb2.append(s3);
                                    liz = liz2;
                                    final StringBuffer sb3 = sb;
                                    final String s4 = "\n";
                                    sb3.append(s4);
                                    continue Label_0142_Outer;
                                }
                                break Label_0142;
                            }
                            catch (final Exception s) {}
                        }
                    }
                    catch (final Exception s) {
                        liz2 = null;
                    }
                    finally {
                        break Label_0142_Outer;
                    }
                    try {
                        final Object o2 = liz2;
                        s = ((BufferedReader)o2).readLine();
                        liz = liz2;
                        final String s2 = s;
                        if (s2 != null) {
                            liz = liz2;
                            final StringBuffer sb2 = sb;
                            final String s3 = s;
                            sb2.append(s3);
                            liz = liz2;
                            final StringBuffer sb3 = sb;
                            final String s4 = "\n";
                            sb3.append(s4);
                            continue Label_0142_Outer;
                        }
                        63F.LIZ((Closeable)liz);
                        o = ((List)o).iterator();
                        while (((Iterator)o).hasNext()) {
                            final JSONObject jsonObject = (JSONObject)((Iterator)o).next();
                            final Object string = jsonObject.getString("name");
                            s = jsonObject.getString("usages");
                            final String string2 = jsonObject.getString("backtrace");
                            liz2 = 0Ql.LIZ(lizj);
                            liz = new StringBuffer();
                            ((StringBuffer)liz).append("pid: 2387, tid: 2991, name: RenderThread  >>> com.bytedance.ammt <<<\nsignal 11 (SIGSEGV), code 2 (SEGV_ACCERR), fault addr 0x75c7e7f020\n    x0  00000075c8288400  x1  00000075c40c1a30  x2  00000075c71fe6d0  x3  0000037e3212143c\n    x4  00000075c8288400  x5  0000000000000010  x6  000000766848e000  x7  000000000014f8f6\n    x8  0000000000000001  x9  0000007665ecc330  x10 00000075c80938e0  x11 0000000000000018\n    x12 0000007664e5aff0  x13 0000000000000000  x14 0000007665ecc330  x15 ffffffffffffffff\n    x16 00000075c7e7f020  x17 0000007666583f7c  x18 000000756d0a0000  x19 00000075c40c1a30\n    x20 00000075c40c1a30  x21 00000075c8288400  x22 0000000000000001  x23 0000007666fc21b8\n    x24 0000007666fc21b0  x25 00000075c40c2000  x26 0000007666fc21b8  x27 00000000000fc000\n    x28 00000075c3fc9000  x29 00000075c40c18d0\n    lr  0000007665ed3810  sp  00000075c40c18d0  pc  00000075c7e7f020  pst 0000000080000000\n\n");
                            ((StringBuffer)liz).append("backtrace:\n");
                            ((StringBuffer)liz).append(string2);
                            ((StringBuffer)liz).append("\n");
                            final String string3 = ((StringBuffer)liz).toString();
                            liz = new File((String)liz2);
                            try {
                                if (!((File)liz).exists()) {
                                    ((File)liz).getParentFile().mkdirs();
                                    ((File)liz).createNewFile();
                                }
                                liz2 = new FileOutputStream((File)liz);
                                try {
                                    ((FileOutputStream)liz2).write(string3.getBytes());
                                    ((FileOutputStream)liz2).flush();
                                    try {
                                        ((FileOutputStream)liz2).close();
                                    }
                                    catch (final Exception liz2) {}
                                }
                                catch (final Exception ex) {}
                            }
                            catch (final Exception liz) {
                                liz2 = null;
                                Label_0393: {
                                    Label_0388: {
                                        Label_0373: {
                                            try {
                                                0II.LIZ((Exception)liz);
                                                break Label_0373;
                                            }
                                            finally {
                                                if (liz2 == null) {}
                                            }
                                            try {
                                                ((FileOutputStream)liz2).close();
                                                break Label_0393;
                                            }
                                            catch (final Exception ex2) {
                                                break Label_0388;
                                            }
                                        }
                                        if (liz2 == null) {
                                            break Label_0393;
                                        }
                                        try {
                                            ((FileOutputStream)liz2).close();
                                            break Label_0393;
                                        }
                                        catch (final Exception ex3) {}
                                    }
                                    0II.LIZ((Exception)liz2);
                                }
                                liz2 = new File(0Ql.LIZ(lizj));
                                if (((String)string).equals("GL_USAGE")) {
                                    liz = 0Ql.LIZ(lizj, "Signal 6(SIGABRT), Code -8 (SI_OOM)\n#00 pc 000c2312  /system/lib/libandroid_runtime.so\n");
                                    ((6M3)liz).LIZJ("usage", s);
                                    ((6M3)liz).LIZJ("profile", sb.toString());
                                    ((6M3)liz).LIZ("profile", "true");
                                    0Ql.a.LIZ((6M3)liz, (File)liz2);
                                    continue Label_0142_Outer;
                                }
                                0Ql.a.LIZ(0Ql.LIZ(lizj, string2), (File)liz2);
                                continue Label_0142_Outer;
                            }
                            MethodCollector.o(53);
                            throw liz;
                        }
                        MethodCollector.o(53);
                        return;
                        liz = liz2;
                        0II.LIZ((Exception)s);
                        liz = liz2;
                        continue Label_0142;
                    }
                    finally {}
                    break;
                }
                break;
            }
            63F.LIZ((Closeable)liz);
            MethodCollector.o(53);
        }
        catch (final JSONException ex4) {
            0II.LIZ((Exception)ex4);
            MethodCollector.o(53);
        }
    }
}
