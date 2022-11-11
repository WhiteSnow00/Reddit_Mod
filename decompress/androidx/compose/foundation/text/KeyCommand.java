// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067" }, d2 = { "Landroidx/compose/foundation/text/KeyCommand;", "", "editsText", "", "(Ljava/lang/String;IZ)V", "getEditsText", "()Z", "LEFT_CHAR", "RIGHT_CHAR", "RIGHT_WORD", "LEFT_WORD", "NEXT_PARAGRAPH", "PREV_PARAGRAPH", "LINE_START", "LINE_END", "LINE_LEFT", "LINE_RIGHT", "UP", "DOWN", "PAGE_UP", "PAGE_DOWN", "HOME", "END", "COPY", "PASTE", "CUT", "DELETE_PREV_CHAR", "DELETE_NEXT_CHAR", "DELETE_PREV_WORD", "DELETE_NEXT_WORD", "DELETE_FROM_LINE_START", "DELETE_TO_LINE_END", "SELECT_ALL", "SELECT_LEFT_CHAR", "SELECT_RIGHT_CHAR", "SELECT_UP", "SELECT_DOWN", "SELECT_PAGE_UP", "SELECT_PAGE_DOWN", "SELECT_HOME", "SELECT_END", "SELECT_LEFT_WORD", "SELECT_RIGHT_WORD", "SELECT_NEXT_PARAGRAPH", "SELECT_PREV_PARAGRAPH", "SELECT_LINE_START", "SELECT_LINE_END", "SELECT_LINE_LEFT", "SELECT_LINE_RIGHT", "DESELECT", "NEW_LINE", "TAB", "UNDO", "REDO", "CHARACTER_PALETTE", "foundation_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum KeyCommand
{
    CHARACTER_PALETTE(true), 
    COPY(false), 
    CUT(true), 
    DELETE_FROM_LINE_START(true), 
    DELETE_NEXT_CHAR(true), 
    DELETE_NEXT_WORD(true), 
    DELETE_PREV_CHAR(true), 
    DELETE_PREV_WORD(true), 
    DELETE_TO_LINE_END(true), 
    DESELECT(false), 
    DOWN(false), 
    END(false), 
    HOME(false), 
    LEFT_CHAR(false), 
    LEFT_WORD(false), 
    LINE_END(false), 
    LINE_LEFT(false), 
    LINE_RIGHT(false), 
    LINE_START(false), 
    NEW_LINE(true), 
    NEXT_PARAGRAPH(false), 
    PAGE_DOWN(false), 
    PAGE_UP(false), 
    PASTE(true), 
    PREV_PARAGRAPH(false), 
    REDO(true), 
    RIGHT_CHAR(false), 
    RIGHT_WORD(false), 
    SELECT_ALL(false), 
    SELECT_DOWN(false), 
    SELECT_END(false), 
    SELECT_HOME(false), 
    SELECT_LEFT_CHAR(false), 
    SELECT_LEFT_WORD(false), 
    SELECT_LINE_END(false), 
    SELECT_LINE_LEFT(false), 
    SELECT_LINE_RIGHT(false), 
    SELECT_LINE_START(false), 
    SELECT_NEXT_PARAGRAPH(false), 
    SELECT_PAGE_DOWN(false), 
    SELECT_PAGE_UP(false), 
    SELECT_PREV_PARAGRAPH(false), 
    SELECT_RIGHT_CHAR(false), 
    SELECT_RIGHT_WORD(false), 
    SELECT_UP(false), 
    TAB(true), 
    UNDO(true), 
    UP(false);
    
    private final boolean editsText;
    
    private KeyCommand(final boolean editsText) {
        this.editsText = editsText;
    }
    
    public final boolean getEditsText() {
        return this.editsText;
    }
}
