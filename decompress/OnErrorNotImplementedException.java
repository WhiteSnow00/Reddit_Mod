// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.exceptions;

public final class OnErrorNotImplementedException extends RuntimeException
{
    private static final long serialVersionUID = -6298857009889503852L;
    
    public OnErrorNotImplementedException(final String s, Throwable t) {
        if (t == null) {
            t = new NullPointerException();
        }
        super(s, t);
    }
    
    public OnErrorNotImplementedException(final Throwable t) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(t);
        this(sb.toString(), t);
    }
}
