// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewParent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.covode.number.Covode;

public final class 04O
{
    static {
        Covode.recordClassIndex(528);
    }
    
    public static InputConnection LIZ(final InputConnection inputConnection, final EditorInfo editorInfo, final View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                if (viewParent instanceof 04B) {
                    editorInfo.hintText = ((04B)viewParent).LIZ();
                    break;
                }
            }
        }
        return inputConnection;
    }
}
