// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import java.io.PrintWriter;
import java.io.PrintStream;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import o8.d;
import com.bumptech.glide.load.DataSource;
import java.util.List;

public final class GlideException extends Exception
{
    public static final StackTraceElement[] f;
    private static final long serialVersionUID = 1L;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private d key;
    
    static {
        f = new StackTraceElement[0];
    }
    
    public GlideException(final String s) {
        this(s, Collections.emptyList());
    }
    
    public GlideException(final String s, final Throwable t) {
        this(s, Collections.singletonList(t));
    }
    
    public GlideException(final String detailMessage, final List<Throwable> causes) {
        this.detailMessage = detailMessage;
        this.setStackTrace(GlideException.f);
        this.causes = causes;
    }
    
    public static void a(final Throwable t, final ArrayList list) {
        if (t instanceof GlideException) {
            final Iterator<Throwable> iterator = ((GlideException)t).getCauses().iterator();
            while (iterator.hasNext()) {
                a(iterator.next(), list);
            }
        }
        else {
            list.add(t);
        }
    }
    
    public static void b(final List list, final a a) {
        try {
            c(list, a);
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void c(final List list, final a a) throws IOException {
        int n;
        for (int size = list.size(), i = 0; i < size; i = n) {
            a.append("Cause (");
            n = i + 1;
            a.append(String.valueOf(n));
            a.append(" of ");
            a.append(String.valueOf(size));
            a.append("): ");
            final Throwable t = list.get(i);
            if (t instanceof GlideException) {
                final GlideException ex = (GlideException)t;
                ex.getClass();
                d(ex, a);
                b(ex.getCauses(), new a(a));
            }
            else {
                d(t, a);
            }
        }
    }
    
    public static void d(final Throwable t, final Appendable appendable) {
        try {
            appendable.append(t.getClass().toString()).append(": ").append(t.getMessage()).append('\n');
        }
        catch (final IOException ex) {
            throw new RuntimeException(t);
        }
    }
    
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
    
    public List<Throwable> getCauses() {
        return this.causes;
    }
    
    @Override
    public String getMessage() {
        final StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        final Class<?> dataClass = this.dataClass;
        final String s = "";
        String string;
        if (dataClass != null) {
            final StringBuilder r = a.r(", ");
            r.append(this.dataClass);
            string = r.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        String string2;
        if (this.dataSource != null) {
            final StringBuilder r2 = a.r(", ");
            r2.append(this.dataSource);
            string2 = r2.toString();
        }
        else {
            string2 = "";
        }
        sb.append(string2);
        String string3 = s;
        if (this.key != null) {
            final StringBuilder r3 = a.r(", ");
            r3.append(this.key);
            string3 = r3.toString();
        }
        sb.append(string3);
        final List<Throwable> rootCauses = this.getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        }
        else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (final Throwable t : rootCauses) {
            sb.append('\n');
            sb.append(t.getClass().getName());
            sb.append('(');
            sb.append(t.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }
    
    public Exception getOrigin() {
        return this.exception;
    }
    
    public List<Throwable> getRootCauses() {
        final ArrayList list = new ArrayList();
        a(this, list);
        return list;
    }
    
    public void logRootCauses(final String s) {
        final List<Throwable> rootCauses = this.getRootCauses();
        int n;
        for (int size = rootCauses.size(), i = 0; i < size; i = n) {
            final StringBuilder r = a.r("Root cause (");
            n = i + 1;
            r.append(n);
            r.append(" of ");
            r.append(size);
            r.append(")");
            Log.i(s, r.toString(), (Throwable)rootCauses.get(i));
        }
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        d(this, printStream);
        b(this.getCauses(), new a(printStream));
    }
    
    @Override
    public void printStackTrace(final PrintWriter printWriter) {
        d(this, printWriter);
        b(this.getCauses(), new a(printWriter));
    }
    
    public void setLoggingDetails(final d d, final DataSource dataSource) {
        this.setLoggingDetails(d, dataSource, null);
    }
    
    public void setLoggingDetails(final d key, final DataSource dataSource, final Class<?> dataClass) {
        this.key = key;
        this.dataSource = dataSource;
        this.dataClass = dataClass;
    }
    
    public void setOrigin(final Exception exception) {
        this.exception = exception;
    }
    
    public static final class a implements Appendable
    {
        public final Appendable f;
        public boolean g;
        
        public a(final Appendable f) {
            this.g = true;
            this.f = f;
        }
        
        @Override
        public final Appendable append(final char c) throws IOException {
            final boolean g = this.g;
            boolean g2 = false;
            if (g) {
                this.g = false;
                this.f.append("  ");
            }
            if (c == '\n') {
                g2 = true;
            }
            this.g = g2;
            this.f.append(c);
            return this;
        }
        
        @Override
        public final Appendable append(final CharSequence charSequence) throws IOException {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            this.append(charSequence2, 0, charSequence2.length());
            return this;
        }
        
        @Override
        public final Appendable append(final CharSequence charSequence, final int n, final int n2) throws IOException {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            final boolean g = this.g;
            final boolean b = false;
            if (g) {
                this.g = false;
                this.f.append("  ");
            }
            boolean g2 = b;
            if (charSequence2.length() > 0) {
                g2 = b;
                if (charSequence2.charAt(n2 - 1) == '\n') {
                    g2 = true;
                }
            }
            this.g = g2;
            this.f.append(charSequence2, n, n2);
            return this;
        }
    }
}
