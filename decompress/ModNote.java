// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ModNote
{
    public static final a<ModNote, Builder> ADAPTER;
    public final String content;
    public final String filtered_subreddit_id;
    public final String filtered_type;
    public final String label;
    public final String operator_id;
    public final String subreddit_search;
    public final String type;
    
    static {
        ADAPTER = (a)new ModNoteAdapter(null);
    }
    
    private ModNote(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.content = Builder.access$200(builder);
        this.label = Builder.access$300(builder);
        this.operator_id = Builder.access$400(builder);
        this.filtered_subreddit_id = Builder.access$500(builder);
        this.subreddit_search = Builder.access$600(builder);
        this.filtered_type = Builder.access$700(builder);
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
        if (!(o instanceof ModNote)) {
            return false;
        }
        final ModNote modNote = (ModNote)o;
        final String type = this.type;
        final String type2 = modNote.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String content = this.content;
            final String content2 = modNote.content;
            if (content == content2 || (content != null && content.equals(content2))) {
                final String label = this.label;
                final String label2 = modNote.label;
                if (label == label2 || (label != null && label.equals(label2))) {
                    final String operator_id = this.operator_id;
                    final String operator_id2 = modNote.operator_id;
                    if (operator_id == operator_id2 || (operator_id != null && operator_id.equals(operator_id2))) {
                        final String filtered_subreddit_id = this.filtered_subreddit_id;
                        final String filtered_subreddit_id2 = modNote.filtered_subreddit_id;
                        if (filtered_subreddit_id == filtered_subreddit_id2 || (filtered_subreddit_id != null && filtered_subreddit_id.equals(filtered_subreddit_id2))) {
                            final String subreddit_search = this.subreddit_search;
                            final String subreddit_search2 = modNote.subreddit_search;
                            if (subreddit_search == subreddit_search2 || (subreddit_search != null && subreddit_search.equals(subreddit_search2))) {
                                final String filtered_type = this.filtered_type;
                                final String filtered_type2 = modNote.filtered_type;
                                boolean b2 = b;
                                if (filtered_type == filtered_type2) {
                                    return b2;
                                }
                                if (filtered_type != null && filtered_type.equals(filtered_type2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final String content = this.content;
        int hashCode3;
        if (content == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = content.hashCode();
        }
        final String label = this.label;
        int hashCode4;
        if (label == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = label.hashCode();
        }
        final String operator_id = this.operator_id;
        int hashCode5;
        if (operator_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = operator_id.hashCode();
        }
        final String filtered_subreddit_id = this.filtered_subreddit_id;
        int hashCode6;
        if (filtered_subreddit_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = filtered_subreddit_id.hashCode();
        }
        final String subreddit_search = this.subreddit_search;
        int hashCode7;
        if (subreddit_search == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subreddit_search.hashCode();
        }
        final String filtered_type = this.filtered_type;
        if (filtered_type != null) {
            hashCode = filtered_type.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ModNote{type=");
        k.append(this.type);
        k.append(", content=");
        k.append(this.content);
        k.append(", label=");
        k.append(this.label);
        k.append(", operator_id=");
        k.append(this.operator_id);
        k.append(", filtered_subreddit_id=");
        k.append(this.filtered_subreddit_id);
        k.append(", subreddit_search=");
        k.append(this.subreddit_search);
        k.append(", filtered_type=");
        return b.j(k, this.filtered_type, "}");
    }
    
    public void write(final e e) throws IOException {
        ModNote.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<ModNote>
    {
        private String content;
        private String filtered_subreddit_id;
        private String filtered_type;
        private String label;
        private String operator_id;
        private String subreddit_search;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final ModNote modNote) {
            this.type = modNote.type;
            this.content = modNote.content;
            this.label = modNote.label;
            this.operator_id = modNote.operator_id;
            this.filtered_subreddit_id = modNote.filtered_subreddit_id;
            this.subreddit_search = modNote.subreddit_search;
            this.filtered_type = modNote.filtered_type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.content;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.label;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.operator_id;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.filtered_subreddit_id;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.subreddit_search;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.filtered_type;
        }
        
        public ModNote build() {
            return new ModNote(this, null);
        }
        
        public Builder content(final String content) {
            this.content = content;
            return this;
        }
        
        public Builder filtered_subreddit_id(final String filtered_subreddit_id) {
            this.filtered_subreddit_id = filtered_subreddit_id;
            return this;
        }
        
        public Builder filtered_type(final String filtered_type) {
            this.filtered_type = filtered_type;
            return this;
        }
        
        public Builder label(final String label) {
            this.label = label;
            return this;
        }
        
        public Builder operator_id(final String operator_id) {
            this.operator_id = operator_id;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.content = null;
            this.label = null;
            this.operator_id = null;
            this.filtered_subreddit_id = null;
            this.subreddit_search = null;
            this.filtered_type = null;
        }
        
        public Builder subreddit_search(final String subreddit_search) {
            this.subreddit_search = subreddit_search;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ModNoteAdapter implements a<ModNote, Builder>
    {
        private ModNoteAdapter() {
        }
        
        public ModNote read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModNote read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.filtered_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.subreddit_search(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.filtered_subreddit_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.operator_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.label(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.content(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final ModNote modNote) throws IOException {
            e.a0();
            if (modNote.type != null) {
                e.N(1, (byte)11);
                e.Z(modNote.type);
                e.O();
            }
            if (modNote.content != null) {
                e.N(2, (byte)11);
                e.Z(modNote.content);
                e.O();
            }
            if (modNote.label != null) {
                e.N(3, (byte)11);
                e.Z(modNote.label);
                e.O();
            }
            if (modNote.operator_id != null) {
                e.N(4, (byte)11);
                e.Z(modNote.operator_id);
                e.O();
            }
            if (modNote.filtered_subreddit_id != null) {
                e.N(5, (byte)11);
                e.Z(modNote.filtered_subreddit_id);
                e.O();
            }
            if (modNote.subreddit_search != null) {
                e.N(6, (byte)11);
                e.Z(modNote.subreddit_search);
                e.O();
            }
            if (modNote.filtered_type != null) {
                e.N(7, (byte)11);
                e.Z(modNote.filtered_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
