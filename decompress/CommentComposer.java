// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class CommentComposer
{
    public static final a<CommentComposer, CommentComposer.CommentComposer$Builder> ADAPTER;
    public final String editor_mode;
    public final String final_status;
    public final String text_type;
    
    static {
        ADAPTER = (a)new CommentComposer.CommentComposer$CommentComposerAdapter((CommentComposer$1)null);
    }
    
    private CommentComposer(final CommentComposer.CommentComposer$Builder commentComposer$Builder) {
        this.editor_mode = CommentComposer.CommentComposer$Builder.access$100(commentComposer$Builder);
        this.text_type = CommentComposer.CommentComposer$Builder.access$200(commentComposer$Builder);
        this.final_status = CommentComposer.CommentComposer$Builder.access$300(commentComposer$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof CommentComposer)) {
            return false;
        }
        final CommentComposer commentComposer = (CommentComposer)o;
        final String editor_mode = this.editor_mode;
        final String editor_mode2 = commentComposer.editor_mode;
        if (editor_mode == editor_mode2 || (editor_mode != null && editor_mode.equals(editor_mode2))) {
            final String text_type = this.text_type;
            final String text_type2 = commentComposer.text_type;
            if (text_type == text_type2 || (text_type != null && text_type.equals(text_type2))) {
                final String final_status = this.final_status;
                final String final_status2 = commentComposer.final_status;
                boolean b2 = b;
                if (final_status == final_status2) {
                    return b2;
                }
                if (final_status != null && final_status.equals(final_status2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String editor_mode = this.editor_mode;
        int hashCode = 0;
        int hashCode2;
        if (editor_mode == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = editor_mode.hashCode();
        }
        final String text_type = this.text_type;
        int hashCode3;
        if (text_type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = text_type.hashCode();
        }
        final String final_status = this.final_status;
        if (final_status != null) {
            hashCode = final_status.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommentComposer{editor_mode=");
        k.append(this.editor_mode);
        k.append(", text_type=");
        k.append(this.text_type);
        k.append(", final_status=");
        return b.j(k, this.final_status, "}");
    }
    
    public void write(final e e) throws IOException {
        CommentComposer.ADAPTER.write(e, (Object)this);
    }
}
