// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class PostComposer
{
    public static final a<PostComposer, Builder> ADAPTER;
    public final String editor_mode;
    public final String final_status;
    public final String input_type;
    public final Boolean post_scheduled;
    public final Long submit_scheduled_timestamp;
    public final String text_type;
    public final String type;
    
    static {
        ADAPTER = (a)new PostComposerAdapter(null);
    }
    
    private PostComposer(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.input_type = Builder.access$200(builder);
        this.text_type = Builder.access$300(builder);
        this.final_status = Builder.access$400(builder);
        this.editor_mode = Builder.access$500(builder);
        this.post_scheduled = Builder.access$600(builder);
        this.submit_scheduled_timestamp = Builder.access$700(builder);
    }
    
    public PostComposer(final Builder builder, final PostComposer$1 object) {
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
        if (!(o instanceof PostComposer)) {
            return false;
        }
        final PostComposer postComposer = (PostComposer)o;
        final String type = this.type;
        final String type2 = postComposer.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String input_type = this.input_type;
            final String input_type2 = postComposer.input_type;
            if (input_type == input_type2 || (input_type != null && input_type.equals(input_type2))) {
                final String text_type = this.text_type;
                final String text_type2 = postComposer.text_type;
                if (text_type == text_type2 || (text_type != null && text_type.equals(text_type2))) {
                    final String final_status = this.final_status;
                    final String final_status2 = postComposer.final_status;
                    if (final_status == final_status2 || (final_status != null && final_status.equals(final_status2))) {
                        final String editor_mode = this.editor_mode;
                        final String editor_mode2 = postComposer.editor_mode;
                        if (editor_mode == editor_mode2 || (editor_mode != null && editor_mode.equals(editor_mode2))) {
                            final Boolean post_scheduled = this.post_scheduled;
                            final Boolean post_scheduled2 = postComposer.post_scheduled;
                            if (post_scheduled == post_scheduled2 || (post_scheduled != null && post_scheduled.equals(post_scheduled2))) {
                                final Long submit_scheduled_timestamp = this.submit_scheduled_timestamp;
                                final Long submit_scheduled_timestamp2 = postComposer.submit_scheduled_timestamp;
                                boolean b2 = b;
                                if (submit_scheduled_timestamp == submit_scheduled_timestamp2) {
                                    return b2;
                                }
                                if (submit_scheduled_timestamp != null && submit_scheduled_timestamp.equals(submit_scheduled_timestamp2)) {
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
        final String input_type = this.input_type;
        int hashCode3;
        if (input_type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = input_type.hashCode();
        }
        final String text_type = this.text_type;
        int hashCode4;
        if (text_type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = text_type.hashCode();
        }
        final String final_status = this.final_status;
        int hashCode5;
        if (final_status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = final_status.hashCode();
        }
        final String editor_mode = this.editor_mode;
        int hashCode6;
        if (editor_mode == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = editor_mode.hashCode();
        }
        final Boolean post_scheduled = this.post_scheduled;
        int hashCode7;
        if (post_scheduled == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = post_scheduled.hashCode();
        }
        final Long submit_scheduled_timestamp = this.submit_scheduled_timestamp;
        if (submit_scheduled_timestamp != null) {
            hashCode = submit_scheduled_timestamp.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostComposer{type=");
        t.append(this.type);
        t.append(", input_type=");
        t.append(this.input_type);
        t.append(", text_type=");
        t.append(this.text_type);
        t.append(", final_status=");
        t.append(this.final_status);
        t.append(", editor_mode=");
        t.append(this.editor_mode);
        t.append(", post_scheduled=");
        t.append(this.post_scheduled);
        t.append(", submit_scheduled_timestamp=");
        return d.l(t, this.submit_scheduled_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        PostComposer.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostComposer>
    {
        private String editor_mode;
        private String final_status;
        private String input_type;
        private Boolean post_scheduled;
        private Long submit_scheduled_timestamp;
        private String text_type;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final PostComposer postComposer) {
            this.type = postComposer.type;
            this.input_type = postComposer.input_type;
            this.text_type = postComposer.text_type;
            this.final_status = postComposer.final_status;
            this.editor_mode = postComposer.editor_mode;
            this.post_scheduled = postComposer.post_scheduled;
            this.submit_scheduled_timestamp = postComposer.submit_scheduled_timestamp;
        }
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static String access$200(final Builder builder) {
            return builder.input_type;
        }
        
        public static String access$300(final Builder builder) {
            return builder.text_type;
        }
        
        public static String access$400(final Builder builder) {
            return builder.final_status;
        }
        
        public static String access$500(final Builder builder) {
            return builder.editor_mode;
        }
        
        public static Boolean access$600(final Builder builder) {
            return builder.post_scheduled;
        }
        
        public static Long access$700(final Builder builder) {
            return builder.submit_scheduled_timestamp;
        }
        
        public PostComposer build() {
            return new PostComposer(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder editor_mode(final String editor_mode) {
            this.editor_mode = editor_mode;
            return this;
        }
        
        public Builder final_status(final String final_status) {
            this.final_status = final_status;
            return this;
        }
        
        public Builder input_type(final String input_type) {
            this.input_type = input_type;
            return this;
        }
        
        public Builder post_scheduled(final Boolean post_scheduled) {
            this.post_scheduled = post_scheduled;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.input_type = null;
            this.text_type = null;
            this.final_status = null;
            this.editor_mode = null;
            this.post_scheduled = null;
            this.submit_scheduled_timestamp = null;
        }
        
        public Builder submit_scheduled_timestamp(final Long submit_scheduled_timestamp) {
            this.submit_scheduled_timestamp = submit_scheduled_timestamp;
            return this;
        }
        
        public Builder text_type(final String text_type) {
            this.text_type = text_type;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class PostComposerAdapter implements a<PostComposer, Builder>
    {
        private PostComposerAdapter() {
        }
        
        public PostComposerAdapter(final PostComposer$1 object) {
            this();
        }
        
        public PostComposer read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostComposer read(final e e, final Builder builder) throws IOException {
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
                        if (a == 10) {
                            builder.submit_scheduled_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.post_scheduled(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.editor_mode(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.final_status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.text_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.input_type(e.F());
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
        
        public void write(final e e, final PostComposer postComposer) throws IOException {
            e.X();
            if (postComposer.type != null) {
                e.O(1, (byte)11);
                e.W(postComposer.type);
                e.P();
            }
            if (postComposer.input_type != null) {
                e.O(2, (byte)11);
                e.W(postComposer.input_type);
                e.P();
            }
            if (postComposer.text_type != null) {
                e.O(3, (byte)11);
                e.W(postComposer.text_type);
                e.P();
            }
            if (postComposer.final_status != null) {
                e.O(4, (byte)11);
                e.W(postComposer.final_status);
                e.P();
            }
            if (postComposer.editor_mode != null) {
                e.O(5, (byte)11);
                e.W(postComposer.editor_mode);
                e.P();
            }
            if (postComposer.post_scheduled != null) {
                e.O(6, (byte)2);
                android.support.v4.media.a.A(postComposer.post_scheduled, e);
            }
            if (postComposer.submit_scheduled_timestamp != null) {
                e.O(7, (byte)10);
                k.w(postComposer.submit_scheduled_timestamp, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostComposer)o);
        }
    }
}
