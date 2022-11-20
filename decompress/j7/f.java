// 
// Decompiled by Procyon v0.6.0
// 

package j7;

import x1.a;
import v0.h;
import x1.c;
import ng2.e;
import androidx.compose.foundation.text.KeyCommand;
import android.view.KeyEvent;
import mg2.l;
import v0.b;

public final class f implements e$b, b
{
    public final l b;
    
    public f(final l b) {
        this.b = b;
    }
    
    public void a(final e$a e$a) {
        this.b.invoke((Object)e$a);
    }
    
    public KeyCommand b(final KeyEvent keyEvent) {
        e.f((Object)keyEvent, "event");
        final boolean booleanValue = (boolean)this.b.invoke((Object)new x1.b(keyEvent));
        final KeyCommand keyCommand = null;
        KeyCommand keyCommand2;
        if (booleanValue && keyEvent.isShiftPressed()) {
            final long c = x1.c.c(keyEvent);
            final int w = h.w;
            keyCommand2 = keyCommand;
            if (a.a(c, h.f)) {
                keyCommand2 = KeyCommand.REDO;
            }
        }
        else if (this.b.invoke((Object)new x1.b(keyEvent))) {
            final long c2 = c.c(keyEvent);
            final int w2 = h.w;
            if (a.a(c2, h.b) || a.a(c2, h.p)) {
                keyCommand2 = KeyCommand.COPY;
            }
            else if (a.a(c2, h.d)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (a.a(c2, h.e)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else if (a.a(c2, h.a)) {
                keyCommand2 = KeyCommand.SELECT_ALL;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(c2, h.f)) {
                    keyCommand2 = KeyCommand.UNDO;
                }
            }
        }
        else if (keyEvent.isCtrlPressed()) {
            keyCommand2 = keyCommand;
        }
        else if (keyEvent.isShiftPressed()) {
            final long c3 = c.c(keyEvent);
            final int w3 = h.w;
            if (a.a(c3, h.h)) {
                keyCommand2 = KeyCommand.SELECT_LEFT_CHAR;
            }
            else if (a.a(c3, h.i)) {
                keyCommand2 = KeyCommand.SELECT_RIGHT_CHAR;
            }
            else if (a.a(c3, h.j)) {
                keyCommand2 = KeyCommand.SELECT_UP;
            }
            else if (a.a(c3, h.k)) {
                keyCommand2 = KeyCommand.SELECT_DOWN;
            }
            else if (a.a(c3, h.l)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_UP;
            }
            else if (a.a(c3, h.m)) {
                keyCommand2 = KeyCommand.SELECT_PAGE_DOWN;
            }
            else if (a.a(c3, h.n)) {
                keyCommand2 = KeyCommand.SELECT_LINE_START;
            }
            else if (a.a(c3, h.o)) {
                keyCommand2 = KeyCommand.SELECT_LINE_END;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(c3, h.p)) {
                    keyCommand2 = KeyCommand.PASTE;
                }
            }
        }
        else {
            final long c4 = c.c(keyEvent);
            final int w4 = h.w;
            if (a.a(c4, h.h)) {
                keyCommand2 = KeyCommand.LEFT_CHAR;
            }
            else if (a.a(c4, h.i)) {
                keyCommand2 = KeyCommand.RIGHT_CHAR;
            }
            else if (a.a(c4, h.j)) {
                keyCommand2 = KeyCommand.UP;
            }
            else if (a.a(c4, h.k)) {
                keyCommand2 = KeyCommand.DOWN;
            }
            else if (a.a(c4, h.l)) {
                keyCommand2 = KeyCommand.PAGE_UP;
            }
            else if (a.a(c4, h.m)) {
                keyCommand2 = KeyCommand.PAGE_DOWN;
            }
            else if (a.a(c4, h.n)) {
                keyCommand2 = KeyCommand.LINE_START;
            }
            else if (a.a(c4, h.o)) {
                keyCommand2 = KeyCommand.LINE_END;
            }
            else if (a.a(c4, h.q)) {
                keyCommand2 = KeyCommand.NEW_LINE;
            }
            else if (a.a(c4, h.r)) {
                keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
            }
            else if (a.a(c4, h.s)) {
                keyCommand2 = KeyCommand.DELETE_NEXT_CHAR;
            }
            else if (a.a(c4, h.t)) {
                keyCommand2 = KeyCommand.PASTE;
            }
            else if (a.a(c4, h.u)) {
                keyCommand2 = KeyCommand.CUT;
            }
            else {
                keyCommand2 = keyCommand;
                if (a.a(c4, h.v)) {
                    keyCommand2 = KeyCommand.TAB;
                }
            }
        }
        return keyCommand2;
    }
}
