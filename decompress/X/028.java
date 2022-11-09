// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources$NotFoundException;
import com.bytedance.covode.number.Covode;

public final class 028 implements UncaughtExceptionHandler
{
    public final /* synthetic */ UncaughtExceptionHandler LIZ;
    
    static {
        Covode.recordClassIndex(266);
    }
    
    public 028(final UncaughtExceptionHandler liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        if (t instanceof Resources$NotFoundException) {
            final String message = t.getMessage();
            if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                final StringBuilder sb = new StringBuilder();
                sb.append(t.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
                ((Throwable)ex).initCause(t.getCause());
                ((Throwable)ex).setStackTrace(t.getStackTrace());
                this.LIZ.uncaughtException(thread, (Throwable)ex);
                return;
            }
        }
        this.LIZ.uncaughtException(thread, t);
    }
}
