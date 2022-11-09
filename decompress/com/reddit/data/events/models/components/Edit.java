// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Edit
{
    public static final a<Edit, Builder> ADAPTER;
    public final String previous_body_text;
    
    static {
        ADAPTER = (a)new EditAdapter(null);
    }
    
    private Edit(final Builder builder) {
        this.previous_body_text = Builder.access$100(builder);
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
        if (!(o instanceof Edit)) {
            return false;
        }
        final Edit edit = (Edit)o;
        final String previous_body_text = this.previous_body_text;
        final String previous_body_text2 = edit.previous_body_text;
        boolean b2 = b;
        if (previous_body_text != previous_body_text2) {
            b2 = (previous_body_text != null && previous_body_text.equals(previous_body_text2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String previous_body_text = this.previous_body_text;
        int hashCode;
        if (previous_body_text == null) {
            hashCode = 0;
        }
        else {
            hashCode = previous_body_text.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Edit{previous_body_text="), this.previous_body_text, "}");
    }
    
    public void write(final e e) throws IOException {
        Edit.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Edit>
    {
        private String previous_body_text;
        
        public Builder() {
        }
        
        public Builder(final Edit edit) {
            this.previous_body_text = edit.previous_body_text;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.previous_body_text;
        }
        
        public Edit build() {
            return new Edit(this, null);
        }
        
        public Builder previous_body_text(final String previous_body_text) {
            this.previous_body_text = previous_body_text;
            return this;
        }
        
        public void reset() {
            this.previous_body_text = null;
        }
    }
    
    public static final class EditAdapter implements a<Edit, Builder>
    {
        private EditAdapter() {
        }
        
        public Edit read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Edit read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    mt.a.a(e, a);
                }
                else if (a == 11) {
                    builder.previous_body_text(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Edit edit) throws IOException {
            e.a0();
            if (edit.previous_body_text != null) {
                e.N(1, (byte)11);
                e.Z(edit.previous_body_text);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
