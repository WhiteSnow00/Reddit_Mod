// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import x1.a;
import ah2.f;
import androidx.compose.foundation.text.KeyCommand;
import android.view.KeyEvent;
import zg2.l;

public final class c implements b
{
    public final /* synthetic */ l<x1.b, Boolean> a;
    
    public c(final l<? super x1.b, Boolean> a) {
        this.a = (l<x1.b, Boolean>)a;
    }
    
    @Override
    public final KeyCommand a(final KeyEvent keyEvent) {
        f.f((Object)keyEvent, "event");
        final boolean booleanValue = (boolean)this.a.invoke((Object)new x1.b(keyEvent));
        final KeyCommand keyCommand = null;
        KeyCommand keyCommand2;
        if (booleanValue && keyEvent.isShiftPressed()) {
            final long f = x1.c.f(keyEvent);
            final int w = i.w;
            keyCommand2 = keyCommand;
            if (x1.a.a(f, i.f)) {
                keyCommand2 = KeyCommand.REDO;
            }
        }
        else if (this.a.invoke((Object)new x1.b(keyEvent))) {
            final long f2 = x1.c.f(keyEvent);
            final int w2 = i.w;
            if (x1.a.a(f2, i.b) || x1.a.a(f2, i.p)) {
                keyCommand2 = KeyCommand.COPY;
            }
            else if (x1.a.a(f2, i.d)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (x1.a.a(f2, i.e)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else if (x1.a.a(f2, i.a)) {
                keyCommand2 = KeyCommand.SELECT_ALL;
            }
            else {
                keyCommand2 = keyCommand;
                if (x1.a.a(f2, i.f)) {
                    keyCommand2 = KeyCommand.UNDO;
                }
            }
        }
        else if (keyEvent.isCtrlPressed()) {
            keyCommand2 = keyCommand;
        }
        else if (keyEvent.isShiftPressed()) {
            final long f3 = x1.c.f(keyEvent);
            final int w3 = i.w;
            if (x1.a.a(f3, i.h)) {
                keyCommand2 = KeyCommand.SELECT_LEFT_CHAR;
            }
            else if (x1.a.a(f3, i.i)) {
                keyCommand2 = KeyCommand.SELECT_RIGHT_CHAR;
            }
            else if (x1.a.a(f3, i.j)) {
                keyCommand2 = KeyCommand.SELECT_UP;
            }
            else if (x1.a.a(f3, i.k)) {
                keyCommand2 = KeyCommand.SELECT_DOWN;
            }
            else if (x1.a.a(f3, i.l)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_UP;
            }
            else if (x1.a.a(f3, i.m)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_DOWN;
            }
            else if (x1.a.a(f3, i.n)) {
                keyCommand2 = KeyCommand.SELECT_LINE_START;
            }
            else if (x1.a.a(f3, i.o)) {
                keyCommand2 = KeyCommand.SELECT_LINE_END;
            }
            else {
                keyCommand2 = keyCommand;
                if (x1.a.a(f3, i.p)) {
                    keyCommand2 = KeyCommand.PASTE;
                }
            }
        }
        else {
            final long f4 = x1.c.f(keyEvent);
            final int w4 = i.w;
            if (x1.a.a(f4, i.h)) {
                keyCommand2 = KeyCommand.LEFT_CHAR;
            }
            else if (x1.a.a(f4, i.i)) {
                keyCommand2 = KeyCommand.RIGHT_CHAR;
            }
            else if (x1.a.a(f4, i.j)) {
                keyCommand2 = KeyCommand.UP;
            }
            else if (x1.a.a(f4, i.k)) {
                keyCommand2 = KeyCommand.DOWN;
            }
            else if (x1.a.a(f4, i.l)) {
                keyCommand2 = KeyCommand.PAGE_UP;
            }
            else if (x1.a.a(f4, i.m)) {
                keyCommand2 = KeyCommand.PAGE_DOWN;
            }
            else if (x1.a.a(f4, i.n)) {
                keyCommand2 = KeyCommand.LINE_START;
            }
            else if (x1.a.a(f4, i.o)) {
                keyCommand2 = KeyCommand.LINE_END;
            }
            else if (x1.a.a(f4, i.q)) {
                keyCommand2 = KeyCommand.NEW_LINE;
            }
            else if (x1.a.a(f4, i.r)) {
                keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
            }
            else if (x1.a.a(f4, i.s)) {
                keyCommand2 = KeyCommand.DELETE_NEXT_CHAR;
            }
            else if (x1.a.a(f4, i.t)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (x1.a.a(f4, i.u)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else {
                keyCommand2 = keyCommand;
                if (x1.a.a(f4, i.v)) {
                    keyCommand2 = KeyCommand.TAB;
                }
            }
        }
        return keyCommand2;
    }
}
