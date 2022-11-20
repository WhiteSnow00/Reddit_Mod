// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

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
    
    public ModNote(final Builder builder, final ModNote$1 object) {
        this(builder);
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
        final StringBuilder t = a.t("ModNote{type=");
        t.append(this.type);
        t.append(", content=");
        t.append(this.content);
        t.append(", label=");
        t.append(this.label);
        t.append(", operator_id=");
        t.append(this.operator_id);
        t.append(", filtered_subreddit_id=");
        t.append(this.filtered_subreddit_id);
        t.append(", subreddit_search=");
        t.append(this.subreddit_search);
        t.append(", filtered_type=");
        return ph0.a.f(t, this.filtered_type, "}");
    }
    
    public void write(final e e) throws IOException {
        ModNote.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModNote>
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
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static String access$200(final Builder builder) {
            return builder.content;
        }
        
        public static String access$300(final Builder builder) {
            return builder.label;
        }
        
        public static String access$400(final Builder builder) {
            return builder.operator_id;
        }
        
        public static String access$500(final Builder builder) {
            return builder.filtered_subreddit_id;
        }
        
        public static String access$600(final Builder builder) {
            return builder.subreddit_search;
        }
        
        public static String access$700(final Builder builder) {
            return builder.filtered_type;
        }
        
        public ModNote build() {
            return new ModNote(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
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
        
        public ModNoteAdapter(final ModNote$1 object) {
            this();
        }
        
        public ModNote read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModNote read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.filtered_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.subreddit_search(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.filtered_subreddit_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.operator_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.label(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.content(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final ModNote modNote) throws IOException {
            e.X();
            if (modNote.type != null) {
                e.O(1, (byte)11);
                e.W(modNote.type);
                e.P();
            }
            if (modNote.content != null) {
                e.O(2, (byte)11);
                e.W(modNote.content);
                e.P();
            }
            if (modNote.label != null) {
                e.O(3, (byte)11);
                e.W(modNote.label);
                e.P();
            }
            if (modNote.operator_id != null) {
                e.O(4, (byte)11);
                e.W(modNote.operator_id);
                e.P();
            }
            if (modNote.filtered_subreddit_id != null) {
                e.O(5, (byte)11);
                e.W(modNote.filtered_subreddit_id);
                e.P();
            }
            if (modNote.subreddit_search != null) {
                e.O(6, (byte)11);
                e.W(modNote.subreddit_search);
                e.P();
            }
            if (modNote.filtered_type != null) {
                e.O(7, (byte)11);
                e.W(modNote.filtered_type);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModNote)o);
        }
    }
}
