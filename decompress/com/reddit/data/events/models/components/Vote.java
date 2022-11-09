// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Vote
{
    public static final a<Vote, Builder> ADAPTER;
    public final Boolean affects_karma;
    public final Boolean affects_score;
    public final String author_id;
    
    static {
        ADAPTER = (a)new VoteAdapter(null);
    }
    
    private Vote(final Builder builder) {
        this.affects_karma = Builder.access$100(builder);
        this.affects_score = Builder.access$200(builder);
        this.author_id = Builder.access$300(builder);
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
        if (!(o instanceof Vote)) {
            return false;
        }
        final Vote vote = (Vote)o;
        final Boolean affects_karma = this.affects_karma;
        final Boolean affects_karma2 = vote.affects_karma;
        if (affects_karma == affects_karma2 || (affects_karma != null && affects_karma.equals(affects_karma2))) {
            final Boolean affects_score = this.affects_score;
            final Boolean affects_score2 = vote.affects_score;
            if (affects_score == affects_score2 || (affects_score != null && affects_score.equals(affects_score2))) {
                final String author_id = this.author_id;
                final String author_id2 = vote.author_id;
                boolean b2 = b;
                if (author_id == author_id2) {
                    return b2;
                }
                if (author_id != null && author_id.equals(author_id2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean affects_karma = this.affects_karma;
        int hashCode = 0;
        int hashCode2;
        if (affects_karma == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = affects_karma.hashCode();
        }
        final Boolean affects_score = this.affects_score;
        int hashCode3;
        if (affects_score == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = affects_score.hashCode();
        }
        final String author_id = this.author_id;
        if (author_id != null) {
            hashCode = author_id.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Vote{affects_karma=");
        k.append(this.affects_karma);
        k.append(", affects_score=");
        k.append(this.affects_score);
        k.append(", author_id=");
        return b.j(k, this.author_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Vote.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Vote>
    {
        private Boolean affects_karma;
        private Boolean affects_score;
        private String author_id;
        
        public Builder() {
        }
        
        public Builder(final Vote vote) {
            this.affects_karma = vote.affects_karma;
            this.affects_score = vote.affects_score;
            this.author_id = vote.author_id;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.affects_karma;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.affects_score;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.author_id;
        }
        
        public Builder affects_karma(final Boolean affects_karma) {
            this.affects_karma = affects_karma;
            return this;
        }
        
        public Builder affects_score(final Boolean affects_score) {
            this.affects_score = affects_score;
            return this;
        }
        
        public Builder author_id(final String author_id) {
            this.author_id = author_id;
            return this;
        }
        
        public Vote build() {
            return new Vote(this, null);
        }
        
        public void reset() {
            this.affects_karma = null;
            this.affects_score = null;
            this.author_id = null;
        }
    }
    
    public static final class VoteAdapter implements a<Vote, Builder>
    {
        private VoteAdapter() {
        }
        
        public Vote read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Vote read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.author_id(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 2) {
                        builder.affects_score(e.b());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 2) {
                    builder.affects_karma(e.b());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Vote vote) throws IOException {
            e.a0();
            if (vote.affects_karma != null) {
                e.N(1, (byte)2);
                d.z(vote.affects_karma, e);
            }
            if (vote.affects_score != null) {
                e.N(2, (byte)2);
                d.z(vote.affects_score, e);
            }
            if (vote.author_id != null) {
                e.N(3, (byte)11);
                e.Z(vote.author_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
