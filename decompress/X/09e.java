// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.text.TextWatcher;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.text.method.KeyListener;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;

public final class 09e
{
    public final a LIZ;
    public int LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(1006);
    }
    
    public 09e(final EditText editText) {
        this.LIZIZ = Integer.MAX_VALUE;
        07U.LIZ(editText, "editText cannot be null");
        this.LIZ = (a)new b(editText);
    }
    
    public final KeyListener LIZ(final KeyListener keyListener) {
        07U.LIZ(keyListener, "keyListener cannot be null");
        return this.LIZ.LIZ(keyListener);
    }
    
    public final InputConnection LIZ(final InputConnection inputConnection, final EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.LIZ.LIZ(inputConnection, editorInfo);
    }
    
    public final void LIZ(final int liziz) {
        07U.LIZ(liziz, "maxEmojiCount should be greater than 0");
        this.LIZIZ = liziz;
        this.LIZ.LIZ(liziz);
    }
    
    public static class a
    {
        static {
            Covode.recordClassIndex(1007);
        }
        
        public KeyListener LIZ(final KeyListener keyListener) {
            return keyListener;
        }
        
        public InputConnection LIZ(final InputConnection inputConnection, final EditorInfo editorInfo) {
            return inputConnection;
        }
        
        public void LIZ(final int n) {
        }
        
        public void LIZIZ(final int n) {
        }
    }
    
    public static final class b extends a
    {
        public final EditText LIZ;
        public final 09l LIZIZ;
        
        static {
            Covode.recordClassIndex(1008);
        }
        
        public b(final EditText liz) {
            (this.LIZ = liz).addTextChangedListener((TextWatcher)(this.LIZIZ = new 09l(liz)));
            liz.setEditableFactory(09f.LIZ());
        }
        
        @Override
        public final KeyListener LIZ(final KeyListener keyListener) {
            if (keyListener instanceof 09i) {
                return keyListener;
            }
            return (KeyListener)new 09i(keyListener);
        }
        
        @Override
        public final InputConnection LIZ(final InputConnection inputConnection, final EditorInfo editorInfo) {
            if (inputConnection instanceof 09g) {
                return inputConnection;
            }
            return (InputConnection)new 09g((TextView)this.LIZ, inputConnection, editorInfo);
        }
        
        @Override
        public final void LIZ(final int liz) {
            this.LIZIZ.LIZ = liz;
        }
        
        @Override
        public final void LIZIZ(final int liziz) {
            this.LIZIZ.LIZIZ = liziz;
        }
    }
}
