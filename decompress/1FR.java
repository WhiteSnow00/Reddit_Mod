// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.LayoutInflater;

public abstract class 1fr extends 14r
{
    public LayoutInflater LIZ;
    public int LJIIJ;
    public int LJIIJJI;
    
    static {
        Covode.recordClassIndex(941);
    }
    
    public 1fr(final Context context, final int n) {
        super(context);
        this.LJIIJJI = n;
        this.LJIIJ = n;
        this.LIZ = (LayoutInflater)LIZ(context, "layout_inflater");
    }
    
    public static Object LIZ(Context context, String declaredField) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    return context;
                }
                finally {
                    return context.getSystemService((String)declaredField);
                }
            }
        }
    }
    
    @Override
    public View LIZ(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return 0II.LIZ(this.LIZ, this.LJIIJ, viewGroup, false);
    }
    
    @Override
    public final View LIZIZ(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return 0II.LIZ(this.LIZ, this.LJIIJJI, viewGroup, false);
    }
}
