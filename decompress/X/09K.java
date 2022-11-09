// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.InputFilter;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class 09k
{
    public final a LIZ;
    
    static {
        Covode.recordClassIndex(1014);
    }
    
    public 09k(final TextView textView) {
        07U.LIZ(textView, "textView cannot be null");
        this.LIZ = (a)new b(textView);
    }
    
    public final void LIZ(final boolean b) {
        this.LIZ.LIZ(b);
    }
    
    public final InputFilter[] LIZ(final InputFilter[] array) {
        return this.LIZ.LIZ(array);
    }
    
    public static class a
    {
        static {
            Covode.recordClassIndex(1015);
        }
        
        public void LIZ() {
        }
        
        public void LIZ(final boolean b) {
        }
        
        public InputFilter[] LIZ(final InputFilter[] array) {
            return array;
        }
    }
    
    public static final class b extends a
    {
        public final TextView LIZ;
        public final 09h LIZIZ;
        
        static {
            Covode.recordClassIndex(1016);
        }
        
        public b(final TextView liz) {
            this.LIZ = liz;
            this.LIZIZ = new 09h(liz);
        }
        
        @Override
        public final void LIZ() {
            Object transformationMethod = this.LIZ.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                final TextView liz = this.LIZ;
                if (!(transformationMethod instanceof 09m)) {
                    transformationMethod = new 09m((TransformationMethod)transformationMethod);
                }
                liz.setTransformationMethod((TransformationMethod)transformationMethod);
            }
        }
        
        @Override
        public final void LIZ(final boolean b) {
            if (b) {
                ((a)this).LIZ();
            }
        }
        
        @Override
        public final InputFilter[] LIZ(final InputFilter[] array) {
            final int length = array.length;
            for (int i = 0; i < length; ++i) {
                if (array[i] instanceof 09h) {
                    return array;
                }
            }
            final InputFilter[] array2 = new InputFilter[array.length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = (InputFilter)this.LIZIZ;
            return array2;
        }
    }
}
