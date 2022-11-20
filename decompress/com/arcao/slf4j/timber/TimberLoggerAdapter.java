// 
// Decompiled by Procyon v0.6.0
// 

package com.arcao.slf4j.timber;

import pu2.a$b;
import zd.b;
import java.util.HashMap;
import qt2.a;
import org.slf4j.helpers.MarkerIgnoringBase;

class TimberLoggerAdapter extends MarkerIgnoringBase
{
    private static final long serialVersionUID = -1227274521521287937L;
    
    public TimberLoggerAdapter(final String name) {
        this.name = name;
    }
    
    public final void a(final TimberLoggerAdapter.TimberLoggerAdapter$LogType timberLoggerAdapter$LogType, final String s, final Object... array) {
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
        Label_0431: {
            if (s == null) {
                a = new a(t, (String)null, array2);
            }
            else if (array2 == null) {
                a = new a((Throwable)null, s, (Object[])null);
            }
            else {
                final StringBuilder sb = new StringBuilder(s.length() + 50);
                int i = 0;
                int n2 = 0;
                while (i < array2.length) {
                    final int index = s.indexOf("{}", n2);
                    if (index == -1) {
                        if (n2 == 0) {
                            a = new a(t, s, array2);
                            break Label_0431;
                        }
                        sb.append(s, n2, s.length());
                        a = new a(t, sb.toString(), array2);
                        break Label_0431;
                    }
                    else {
                        boolean b = false;
                        Label_0265: {
                            if (index != 0) {
                                if (s.charAt(index - 1) == '\\') {
                                    b = true;
                                    break Label_0265;
                                }
                            }
                            b = false;
                        }
                        Label_0397: {
                            if (b) {
                                if (index < 2 || s.charAt(index - 2) != '\\') {
                                    --i;
                                    sb.append(s, n2, index - 1);
                                    sb.append('{');
                                    n2 = index + 1;
                                    break Label_0397;
                                }
                                sb.append(s, n2, index - 1);
                                zd.b.M(sb, array2[i], new HashMap());
                            }
                            else {
                                sb.append(s, n2, index);
                                zd.b.M(sb, array2[i], new HashMap());
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
        this.b(timberLoggerAdapter$LogType, a.a, a.b);
    }
    
    public final void b(final TimberLoggerAdapter.TimberLoggerAdapter$LogType timberLoggerAdapter$LogType, final String s, final Throwable t) {
        final String name = this.name;
        final a$b a = pu2.a.a;
        a.s(name);
        final int n = TimberLoggerAdapter$a.a[((Enum)timberLoggerAdapter$LogType).ordinal()];
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
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.DEBUG, s, null);
    }
    
    public void debug(final String s, final Object o) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.DEBUG, s, o);
    }
    
    public void debug(final String s, final Object o, final Object o2) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.DEBUG, s, o, o2);
    }
    
    public void debug(final String s, final Throwable t) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.DEBUG, s, t);
    }
    
    public void debug(final String s, final Object... array) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.DEBUG, s, array);
    }
    
    public void error(final String s) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.ERROR, s, null);
    }
    
    public void error(final String s, final Object o) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.ERROR, s, o);
    }
    
    public void error(final String s, final Object o, final Object o2) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.ERROR, s, o, o2);
    }
    
    public void error(final String s, final Throwable t) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.ERROR, s, t);
    }
    
    public void error(final String s, final Object... array) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.ERROR, s, array);
    }
    
    public void info(final String s) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.INFO, s, null);
    }
    
    public void info(final String s, final Object o) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.INFO, s, o);
    }
    
    public void info(final String s, final Object o, final Object o2) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.INFO, s, o, o2);
    }
    
    public void info(final String s, final Throwable t) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.INFO, s, t);
    }
    
    public void info(final String s, final Object... array) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.INFO, s, array);
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
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.TRACE, s, null);
    }
    
    public void trace(final String s, final Object o) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.TRACE, s, o);
    }
    
    public void trace(final String s, final Object o, final Object o2) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.TRACE, s, o, o2);
    }
    
    public void trace(final String s, final Throwable t) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.TRACE, s, t);
    }
    
    public void trace(final String s, final Object... array) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.TRACE, s, array);
    }
    
    public void warn(final String s) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.WARN, s, null);
    }
    
    public void warn(final String s, final Object o) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.WARN, s, o);
    }
    
    public void warn(final String s, final Object o, final Object o2) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.WARN, s, o, o2);
    }
    
    public void warn(final String s, final Throwable t) {
        this.b(TimberLoggerAdapter.TimberLoggerAdapter$LogType.WARN, s, t);
    }
    
    public void warn(final String s, final Object... array) {
        this.a(TimberLoggerAdapter.TimberLoggerAdapter$LogType.WARN, s, array);
    }
}
