// 
// Decompiled by Procyon v0.6.0
// 

package aj2;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$b;
import zi2.a0$a;
import zi2.a0;
import gg2.a;

public final class b extends a implements a0
{
    private volatile Object _preHandler;
    
    public b() {
        super((CoroutineContext$b)a0$a.f);
        this._preHandler = this;
    }
    
    public void t(final CoroutineContext coroutineContext, final Throwable t) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 1;
        if (26 > sdk_INT || sdk_INT >= 28) {
            return;
        }
        final Object preHandler = this._preHandler;
        Object o = null;
        Label_0109: {
            if (preHandler != this) {
                final Method declaredMethod = (Method)preHandler;
                break Label_0109;
            }
            while (true) {
                try {
                    Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class<?>[])new Class[0]);
                    int n2;
                    if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        declaredMethod = null;
                    }
                    this._preHandler = declaredMethod;
                    Object invoke;
                    if (declaredMethod != null) {
                        invoke = declaredMethod.invoke(null, new Object[0]);
                    }
                    else {
                        invoke = null;
                    }
                    if (invoke instanceof Thread.UncaughtExceptionHandler) {
                        o = invoke;
                    }
                    if (o != null) {
                        ((Thread.UncaughtExceptionHandler)o).uncaughtException(Thread.currentThread(), t);
                    }
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
