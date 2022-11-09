// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import mj2.c0;
import android.widget.TextView;

public final class f
{
    public final a a;
    
    public f(final TextView textView) {
        c0.s((Object)textView, "textView cannot be null");
        this.a = new a(textView);
    }
    
    public static final class a extends b
    {
        public final TextView a;
        public final d b;
        
        public a(final TextView a) {
            this.a = a;
            this.b = new d(a);
        }
        
        public final void a() {
            Object transformationMethod = this.a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                final TextView a = this.a;
                if (!(transformationMethod instanceof h)) {
                    transformationMethod = new h((TransformationMethod)transformationMethod);
                }
                a.setTransformationMethod((TransformationMethod)transformationMethod);
            }
        }
    }
    
    public static class b
    {
    }
}
