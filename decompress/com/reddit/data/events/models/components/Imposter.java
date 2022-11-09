// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class Imposter
{
    public static final a<Imposter, Builder> ADAPTER;
    public final String game_id;
    public final String imposter_id;
    public final String note_id;
    public final Boolean note_ignore;
    public final String note_text;
    public final String notes_blob;
    public final Boolean success;
    
    static {
        ADAPTER = (a)new ImposterAdapter(null);
    }
    
    private Imposter(final Builder builder) {
        this.game_id = Builder.access$100(builder);
        this.note_text = Builder.access$200(builder);
        this.note_id = Builder.access$300(builder);
        this.notes_blob = Builder.access$400(builder);
        this.success = Builder.access$500(builder);
        this.imposter_id = Builder.access$600(builder);
        this.note_ignore = Builder.access$700(builder);
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
        if (!(o instanceof Imposter)) {
            return false;
        }
        final Imposter imposter = (Imposter)o;
        final String game_id = this.game_id;
        final String game_id2 = imposter.game_id;
        if (game_id == game_id2 || (game_id != null && game_id.equals(game_id2))) {
            final String note_text = this.note_text;
            final String note_text2 = imposter.note_text;
            if (note_text == note_text2 || (note_text != null && note_text.equals(note_text2))) {
                final String note_id = this.note_id;
                final String note_id2 = imposter.note_id;
                if (note_id == note_id2 || (note_id != null && note_id.equals(note_id2))) {
                    final String notes_blob = this.notes_blob;
                    final String notes_blob2 = imposter.notes_blob;
                    if (notes_blob == notes_blob2 || (notes_blob != null && notes_blob.equals(notes_blob2))) {
                        final Boolean success = this.success;
                        final Boolean success2 = imposter.success;
                        if (success == success2 || (success != null && success.equals(success2))) {
                            final String imposter_id = this.imposter_id;
                            final String imposter_id2 = imposter.imposter_id;
                            if (imposter_id == imposter_id2 || (imposter_id != null && imposter_id.equals(imposter_id2))) {
                                final Boolean note_ignore = this.note_ignore;
                                final Boolean note_ignore2 = imposter.note_ignore;
                                boolean b2 = b;
                                if (note_ignore == note_ignore2) {
                                    return b2;
                                }
                                if (note_ignore != null && note_ignore.equals(note_ignore2)) {
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
        final String game_id = this.game_id;
        int hashCode = 0;
        int hashCode2;
        if (game_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = game_id.hashCode();
        }
        final String note_text = this.note_text;
        int hashCode3;
        if (note_text == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = note_text.hashCode();
        }
        final String note_id = this.note_id;
        int hashCode4;
        if (note_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = note_id.hashCode();
        }
        final String notes_blob = this.notes_blob;
        int hashCode5;
        if (notes_blob == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = notes_blob.hashCode();
        }
        final Boolean success = this.success;
        int hashCode6;
        if (success == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = success.hashCode();
        }
        final String imposter_id = this.imposter_id;
        int hashCode7;
        if (imposter_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = imposter_id.hashCode();
        }
        final Boolean note_ignore = this.note_ignore;
        if (note_ignore != null) {
            hashCode = note_ignore.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Imposter{game_id=");
        k.append(this.game_id);
        k.append(", note_text=");
        k.append(this.note_text);
        k.append(", note_id=");
        k.append(this.note_id);
        k.append(", notes_blob=");
        k.append(this.notes_blob);
        k.append(", success=");
        k.append(this.success);
        k.append(", imposter_id=");
        k.append(this.imposter_id);
        k.append(", note_ignore=");
        k.append(this.note_ignore);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Imposter.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Imposter>
    {
        private String game_id;
        private String imposter_id;
        private String note_id;
        private Boolean note_ignore;
        private String note_text;
        private String notes_blob;
        private Boolean success;
        
        public Builder() {
        }
        
        public Builder(final Imposter imposter) {
            this.game_id = imposter.game_id;
            this.note_text = imposter.note_text;
            this.note_id = imposter.note_id;
            this.notes_blob = imposter.notes_blob;
            this.success = imposter.success;
            this.imposter_id = imposter.imposter_id;
            this.note_ignore = imposter.note_ignore;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.game_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.note_text;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.note_id;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.notes_blob;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.success;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.imposter_id;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.note_ignore;
        }
        
        public Imposter build() {
            return new Imposter(this, null);
        }
        
        public Builder game_id(final String game_id) {
            this.game_id = game_id;
            return this;
        }
        
        public Builder imposter_id(final String imposter_id) {
            this.imposter_id = imposter_id;
            return this;
        }
        
        public Builder note_id(final String note_id) {
            this.note_id = note_id;
            return this;
        }
        
        public Builder note_ignore(final Boolean note_ignore) {
            this.note_ignore = note_ignore;
            return this;
        }
        
        public Builder note_text(final String note_text) {
            this.note_text = note_text;
            return this;
        }
        
        public Builder notes_blob(final String notes_blob) {
            this.notes_blob = notes_blob;
            return this;
        }
        
        public void reset() {
            this.game_id = null;
            this.note_text = null;
            this.note_id = null;
            this.notes_blob = null;
            this.success = null;
            this.imposter_id = null;
            this.note_ignore = null;
        }
        
        public Builder success(final Boolean success) {
            this.success = success;
            return this;
        }
    }
    
    public static final class ImposterAdapter implements a<Imposter, Builder>
    {
        private ImposterAdapter() {
        }
        
        public Imposter read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Imposter read(final e e, final Builder builder) throws IOException {
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
                        if (a == 2) {
                            builder.note_ignore(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.imposter_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.success(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.notes_blob(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.note_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.note_text(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.game_id(e.F());
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
        
        public void write(final e e, final Imposter imposter) throws IOException {
            e.a0();
            if (imposter.game_id != null) {
                e.N(1, (byte)11);
                e.Z(imposter.game_id);
                e.O();
            }
            if (imposter.note_text != null) {
                e.N(2, (byte)11);
                e.Z(imposter.note_text);
                e.O();
            }
            if (imposter.note_id != null) {
                e.N(3, (byte)11);
                e.Z(imposter.note_id);
                e.O();
            }
            if (imposter.notes_blob != null) {
                e.N(4, (byte)11);
                e.Z(imposter.notes_blob);
                e.O();
            }
            if (imposter.success != null) {
                e.N(5, (byte)2);
                d.z(imposter.success, e);
            }
            if (imposter.imposter_id != null) {
                e.N(6, (byte)11);
                e.Z(imposter.imposter_id);
                e.O();
            }
            if (imposter.note_ignore != null) {
                e.N(7, (byte)2);
                d.z(imposter.note_ignore, e);
            }
            e.P();
            e.b0();
        }
    }
}
