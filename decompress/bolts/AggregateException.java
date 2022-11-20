// 
// Decompiled by Procyon v0.6.0
// 

package bolts;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AggregateException extends Exception
{
    private static final long serialVersionUID = 1L;
    private List<Throwable> innerThrowables;
    
    public AggregateException(final String s, final List<? extends Throwable> list) {
        Throwable t;
        if (list != null && list.size() > 0) {
            t = list.get(0);
        }
        else {
            t = null;
        }
        super(s, t);
        this.innerThrowables = Collections.unmodifiableList(list);
    }
    
    public AggregateException(final String s, final Throwable[] array) {
        this(s, Arrays.asList(array));
    }
    
    public AggregateException(final List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }
    
    @Deprecated
    public Throwable[] getCauses() {
        final List<Throwable> innerThrowables = this.innerThrowables;
        return innerThrowables.toArray(new Throwable[innerThrowables.size()]);
    }
    
    @Deprecated
    public List<Exception> getErrors() {
        final ArrayList list = new ArrayList();
        final List<Throwable> innerThrowables = this.innerThrowables;
        if (innerThrowables == null) {
            return list;
        }
        for (final Throwable t : innerThrowables) {
            if (t instanceof Exception) {
                list.add(t);
            }
            else {
                list.add(new Exception(t));
            }
        }
        return list;
    }
    
    public List<Throwable> getInnerThrowables() {
        return this.innerThrowables;
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        super.printStackTrace(printStream);
        final Iterator<Throwable> iterator = this.innerThrowables.iterator();
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
    public void printStackTrace(final PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        final Iterator<Throwable> iterator = this.innerThrowables.iterator();
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
