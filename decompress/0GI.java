// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0Gi extends Exception
{
    public static final long serialVersionUID = 1L;
    public List<Throwable> LIZ;
    
    static {
        Covode.recordClassIndex(1779);
    }
    
    public 0Gi(final String s, final List<? extends Throwable> list) {
        Throwable t;
        if (list != null && list.size() > 0) {
            t = list.get(0);
        }
        else {
            t = null;
        }
        super(s, t);
        this.LIZ = Collections.unmodifiableList(list);
    }
    
    public 0Gi(final String s, final Throwable[] array) {
        this(s, Arrays.asList(array));
    }
    
    public 0Gi(final List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }
    
    public final Throwable[] getCauses() {
        final List<Throwable> liz = this.LIZ;
        return liz.toArray(new Throwable[liz.size()]);
    }
    
    public final List<Exception> getErrors() {
        final ArrayList list = new ArrayList();
        final List<Throwable> liz = this.LIZ;
        if (liz == null) {
            return list;
        }
        for (final Throwable t : liz) {
            if (t instanceof Exception) {
                list.add(t);
            }
            else {
                list.add(new Exception(t));
            }
        }
        return list;
    }
    
    public final List<Throwable> getInnerThrowables() {
        return this.LIZ;
    }
    
    @Override
    public final void printStackTrace(final PrintStream printStream) {
        super.printStackTrace(printStream);
        final Iterator<Throwable> iterator = this.LIZ.iterator();
        int n = -1;
        while (iterator.hasNext()) {
            final Throwable t = iterator.next();
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            ++n;
            printStream.append(Integer.toString(n));
            printStream.append(": ");
            t.printStackTrace(printStream);
            printStream.append("\n");
        }
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        final Iterator<Throwable> iterator = this.LIZ.iterator();
        int n = -1;
        while (iterator.hasNext()) {
            final Throwable t = iterator.next();
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            ++n;
            printWriter.append(Integer.toString(n));
            printWriter.append(": ");
            t.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
