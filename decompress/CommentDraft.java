// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class CommentDraft
{
    public static final a<CommentDraft, CommentDraft.CommentDraft$Builder> ADAPTER;
    public final String body_text;
    
    static {
        ADAPTER = (a)new CommentDraft.CommentDraft$CommentDraftAdapter((CommentDraft$1)null);
    }
    
    private CommentDraft(final CommentDraft.CommentDraft$Builder commentDraft$Builder) {
        this.body_text = CommentDraft.CommentDraft$Builder.access$100(commentDraft$Builder);
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
        if (!(o instanceof CommentDraft)) {
            return false;
        }
        final CommentDraft commentDraft = (CommentDraft)o;
        final String body_text = this.body_text;
        final String body_text2 = commentDraft.body_text;
        boolean b2 = b;
        if (body_text != body_text2) {
            b2 = (body_text != null && body_text.equals(body_text2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String body_text = this.body_text;
        int hashCode;
        if (body_text == null) {
            hashCode = 0;
        }
        else {
            hashCode = body_text.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("CommentDraft{body_text="), this.body_text, "}");
    }
    
    public void write(final e e) throws IOException {
        CommentDraft.ADAPTER.write(e, (Object)this);
    }
}
