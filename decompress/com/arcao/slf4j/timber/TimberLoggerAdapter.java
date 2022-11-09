// 
// Decompiled by Procyon v0.6.0
// 

package com.arcao.slf4j.timber;

import bv2.a$b;
import aj2.c;
import java.util.HashMap;
import cu2.a;
import org.slf4j.helpers.MarkerIgnoringBase;

class TimberLoggerAdapter extends MarkerIgnoringBase
{
    private static final long serialVersionUID = -1227274521521287937L;
    
    public TimberLoggerAdapter(final String name) {
        this.name = name;
    }
    
    public final void a(final LogType logType, final String s, final Object... array) {
        Throwable t = null;
        Label_0041: {
            if (array != null) {
                if (array.length != 0) {
                    final Object o = array[array.length - 1];
                    if (o instanceof Throwable) {
                        t = (Throwable)o;
                        break Label_0041;
                    }
                }
            }
            t = null;
        }
        Object[] array2 = array;
        if (t != null) {
            if (array == null || array.length == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            final int n = array.length - 1;
            array2 = new Object[n];
            if (n > 0) {
                System.arraycopy(array, 0, array2, 0, n);
            }
        }
        a a = null;
        Label_0432: {
            if (s == null) {
                a = new a(t, (String)null, array2);
            }
            else if (array2 == null) {
                a = new a((Throwable)null, s, (Object[])null);
            }
            else {
                final StringBuilder sb = new StringBuilder(s.length() + 50);
                int n2;
                int i = n2 = 0;
                while (i < array2.length) {
                    final int index = s.indexOf("{}", n2);
                    if (index == -1) {
                        if (n2 == 0) {
                            a = new a(t, s, array2);
                            break Label_0432;
                        }
                        sb.append(s, n2, s.length());
                        a = new a(t, sb.toString(), array2);
                        break Label_0432;
                    }
                    else {
                        boolean b = false;
                        Label_0266: {
                            if (index != 0) {
                                if (s.charAt(index - 1) == '\\') {
                                    b = true;
                                    break Label_0266;
                                }
                            }
                            b = false;
                        }
                        Label_0398: {
                            if (b) {
                                if (index < 2 || s.charAt(index - 2) != '\\') {
                                    --i;
                                    sb.append(s, n2, index - 1);
                                    sb.append('{');
                                    n2 = index + 1;
                                    break Label_0398;
                                }
                                sb.append(s, n2, index - 1);
                                c.L(sb, array2[i], new HashMap());
                            }
                            else {
                                sb.append(s, n2, index);
                                c.L(sb, array2[i], new HashMap());
                            }
                            n2 = index + 2;
                        }
                        ++i;
                    }
                }
                sb.append(s, n2, s.length());
                a = new a(t, sb.toString(), array2);
            }
        }
        this.b(logType, a.a, a.b);
    }
    
    public final void b(final LogType logType, final String s, final Throwable t) {
        final String name = this.name;
        final a$b a = bv2.a.a;
        a.s(name);
        final int n = TimberLoggerAdapter$a.a[logType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 4) {
                    if (n != 5) {
                        if (t != null) {
                            a.j(t, s, new Object[0]);
                        }
                        else {
                            a.i(s, new Object[0]);
                        }
                    }
                    else if (t != null) {
                        a.f(t, s, new Object[0]);
                    }
                    else {
                        a.d(s, new Object[0]);
                    }
                }
                else if (t != null) {
                    a.q(t, s, new Object[0]);
                }
                else {
                    a.o(s, new Object[0]);
                }
            }
            else if (t != null) {
                a.c(t, s, new Object[0]);
            }
            else {
                a.a(s, new Object[0]);
            }
        }
        else if (t != null) {
            a.n(t, s, new Object[0]);
        }
        else {
            a.m(s, new Object[0]);
        }
    }
    
    public void debug(final String s) {
        this.b(LogType.DEBUG, s, null);
    }
    
    public void debug(final String s, final Object o) {
        this.a(LogType.DEBUG, s, o);
    }
    
    public void debug(final String s, final Object o, final Object o2) {
        this.a(LogType.DEBUG, s, o, o2);
    }
    
    public void debug(final String s, final Throwable t) {
        this.b(LogType.DEBUG, s, t);
    }
    
    public void debug(final String s, final Object... array) {
        this.a(LogType.DEBUG, s, array);
    }
    
    public void error(final String s) {
        this.b(LogType.ERROR, s, null);
    }
    
    public void error(final String s, final Object o) {
        this.a(LogType.ERROR, s, o);
    }
    
    public void error(final String s, final Object o, final Object o2) {
        this.a(LogType.ERROR, s, o, o2);
    }
    
    public void error(final String s, final Throwable t) {
        this.b(LogType.ERROR, s, t);
    }
    
    public void error(final String s, final Object... array) {
        this.a(LogType.ERROR, s, array);
    }
    
    public void info(final String s) {
        this.b(LogType.INFO, s, null);
    }
    
    public void info(final String s, final Object o) {
        this.a(LogType.INFO, s, o);
    }
    
    public void info(final String s, final Object o, final Object o2) {
        this.a(LogType.INFO, s, o, o2);
    }
    
    public void info(final String s, final Throwable t) {
        this.b(LogType.INFO, s, t);
    }
    
    public void info(final String s, final Object... array) {
        this.a(LogType.INFO, s, array);
    }
    
    public boolean isDebugEnabled() {
        return true;
    }
    
    public boolean isErrorEnabled() {
        return true;
    }
    
    public boolean isInfoEnabled() {
        return true;
    }
    
    public boolean isTraceEnabled() {
        return true;
    }
    
    public boolean isWarnEnabled() {
        return true;
    }
    
    public void trace(final String s) {
        this.b(LogType.TRACE, s, null);
    }
    
    public void trace(final String s, final Object o) {
        this.a(LogType.TRACE, s, o);
    }
    
    public void trace(final String s, final Object o, final Object o2) {
        this.a(LogType.TRACE, s, o, o2);
    }
    
    public void trace(final String s, final Throwable t) {
        this.b(LogType.TRACE, s, t);
    }
    
    public void trace(final String s, final Object... array) {
        this.a(LogType.TRACE, s, array);
    }
    
    public void warn(final String s) {
        this.b(LogType.WARN, s, null);
    }
    
    public void warn(final String s, final Object o) {
        this.a(LogType.WARN, s, o);
    }
    
    public void warn(final String s, final Object o, final Object o2) {
        this.a(LogType.WARN, s, o, o2);
    }
    
    public void warn(final String s, final Throwable t) {
        this.b(LogType.WARN, s, t);
    }
    
    public void warn(final String s, final Object... array) {
        this.a(LogType.WARN, s, array);
    }
    
    public enum LogType
    {
        DEBUG, 
        ERROR, 
        INFO, 
        TRACE, 
        WARN;
    }
}
