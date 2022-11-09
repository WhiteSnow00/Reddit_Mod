// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import kt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class AdDecision
{
    public static final a<AdDecision, Builder> ADAPTER;
    public final Boolean hide_bad_keywords;
    public final Boolean hide_experiment;
    public final Boolean hide_full_bleed;
    public final Boolean hide_gold;
    public final Boolean hide_mod;
    public final Boolean hide_news;
    public final Boolean hide_nsfw;
    public final Boolean hide_other;
    public final Boolean hide_sort;
    public final Boolean hide_source_post;
    public final Boolean hide_whitelist;
    
    static {
        ADAPTER = (a)new AdDecisionAdapter(null);
    }
    
    private AdDecision(final Builder builder) {
        this.hide_gold = Builder.access$100(builder);
        this.hide_mod = Builder.access$200(builder);
        this.hide_news = Builder.access$300(builder);
        this.hide_whitelist = Builder.access$400(builder);
        this.hide_sort = Builder.access$500(builder);
        this.hide_experiment = Builder.access$600(builder);
        this.hide_other = Builder.access$700(builder);
        this.hide_source_post = Builder.access$800(builder);
        this.hide_bad_keywords = Builder.access$900(builder);
        this.hide_full_bleed = Builder.access$1000(builder);
        this.hide_nsfw = Builder.access$1100(builder);
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
        if (!(o instanceof AdDecision)) {
            return false;
        }
        final AdDecision adDecision = (AdDecision)o;
        final Boolean hide_gold = this.hide_gold;
        final Boolean hide_gold2 = adDecision.hide_gold;
        if (hide_gold == hide_gold2 || (hide_gold != null && hide_gold.equals(hide_gold2))) {
            final Boolean hide_mod = this.hide_mod;
            final Boolean hide_mod2 = adDecision.hide_mod;
            if (hide_mod == hide_mod2 || (hide_mod != null && hide_mod.equals(hide_mod2))) {
                final Boolean hide_news = this.hide_news;
                final Boolean hide_news2 = adDecision.hide_news;
                if (hide_news == hide_news2 || (hide_news != null && hide_news.equals(hide_news2))) {
                    final Boolean hide_whitelist = this.hide_whitelist;
                    final Boolean hide_whitelist2 = adDecision.hide_whitelist;
                    if (hide_whitelist == hide_whitelist2 || (hide_whitelist != null && hide_whitelist.equals(hide_whitelist2))) {
                        final Boolean hide_sort = this.hide_sort;
                        final Boolean hide_sort2 = adDecision.hide_sort;
                        if (hide_sort == hide_sort2 || (hide_sort != null && hide_sort.equals(hide_sort2))) {
                            final Boolean hide_experiment = this.hide_experiment;
                            final Boolean hide_experiment2 = adDecision.hide_experiment;
                            if (hide_experiment == hide_experiment2 || (hide_experiment != null && hide_experiment.equals(hide_experiment2))) {
                                final Boolean hide_other = this.hide_other;
                                final Boolean hide_other2 = adDecision.hide_other;
                                if (hide_other == hide_other2 || (hide_other != null && hide_other.equals(hide_other2))) {
                                    final Boolean hide_source_post = this.hide_source_post;
                                    final Boolean hide_source_post2 = adDecision.hide_source_post;
                                    if (hide_source_post == hide_source_post2 || (hide_source_post != null && hide_source_post.equals(hide_source_post2))) {
                                        final Boolean hide_bad_keywords = this.hide_bad_keywords;
                                        final Boolean hide_bad_keywords2 = adDecision.hide_bad_keywords;
                                        if (hide_bad_keywords == hide_bad_keywords2 || (hide_bad_keywords != null && hide_bad_keywords.equals(hide_bad_keywords2))) {
                                            final Boolean hide_full_bleed = this.hide_full_bleed;
                                            final Boolean hide_full_bleed2 = adDecision.hide_full_bleed;
                                            if (hide_full_bleed == hide_full_bleed2 || (hide_full_bleed != null && hide_full_bleed.equals(hide_full_bleed2))) {
                                                final Boolean hide_nsfw = this.hide_nsfw;
                                                final Boolean hide_nsfw2 = adDecision.hide_nsfw;
                                                boolean b2 = b;
                                                if (hide_nsfw == hide_nsfw2) {
                                                    return b2;
                                                }
                                                if (hide_nsfw != null && hide_nsfw.equals(hide_nsfw2)) {
                                                    b2 = b;
                                                    return b2;
                                                }
                                            }
                                        }
                                    }
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
        final Boolean hide_gold = this.hide_gold;
        int hashCode = 0;
        int hashCode2;
        if (hide_gold == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = hide_gold.hashCode();
        }
        final Boolean hide_mod = this.hide_mod;
        int hashCode3;
        if (hide_mod == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = hide_mod.hashCode();
        }
        final Boolean hide_news = this.hide_news;
        int hashCode4;
        if (hide_news == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = hide_news.hashCode();
        }
        final Boolean hide_whitelist = this.hide_whitelist;
        int hashCode5;
        if (hide_whitelist == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = hide_whitelist.hashCode();
        }
        final Boolean hide_sort = this.hide_sort;
        int hashCode6;
        if (hide_sort == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = hide_sort.hashCode();
        }
        final Boolean hide_experiment = this.hide_experiment;
        int hashCode7;
        if (hide_experiment == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = hide_experiment.hashCode();
        }
        final Boolean hide_other = this.hide_other;
        int hashCode8;
        if (hide_other == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = hide_other.hashCode();
        }
        final Boolean hide_source_post = this.hide_source_post;
        int hashCode9;
        if (hide_source_post == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = hide_source_post.hashCode();
        }
        final Boolean hide_bad_keywords = this.hide_bad_keywords;
        int hashCode10;
        if (hide_bad_keywords == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = hide_bad_keywords.hashCode();
        }
        final Boolean hide_full_bleed = this.hide_full_bleed;
        int hashCode11;
        if (hide_full_bleed == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = hide_full_bleed.hashCode();
        }
        final Boolean hide_nsfw = this.hide_nsfw;
        if (hide_nsfw != null) {
            hashCode = hide_nsfw.hashCode();
        }
        return (((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdDecision{hide_gold=");
        k.append(this.hide_gold);
        k.append(", hide_mod=");
        k.append(this.hide_mod);
        k.append(", hide_news=");
        k.append(this.hide_news);
        k.append(", hide_whitelist=");
        k.append(this.hide_whitelist);
        k.append(", hide_sort=");
        k.append(this.hide_sort);
        k.append(", hide_experiment=");
        k.append(this.hide_experiment);
        k.append(", hide_other=");
        k.append(this.hide_other);
        k.append(", hide_source_post=");
        k.append(this.hide_source_post);
        k.append(", hide_bad_keywords=");
        k.append(this.hide_bad_keywords);
        k.append(", hide_full_bleed=");
        k.append(this.hide_full_bleed);
        k.append(", hide_nsfw=");
        k.append(this.hide_nsfw);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AdDecision.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AdDecisionAdapter implements a<AdDecision, Builder>
    {
        private AdDecisionAdapter() {
        }
        
        public AdDecision read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AdDecision read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.hide_nsfw(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.hide_full_bleed(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.hide_bad_keywords(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.hide_source_post(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.hide_other(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.hide_experiment(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.hide_sort(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.hide_whitelist(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.hide_news(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 2) {
                            builder.hide_mod(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 2) {
                            builder.hide_gold(e.b());
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
        
        public void write(final e e, final AdDecision adDecision) throws IOException {
            e.a0();
            if (adDecision.hide_gold != null) {
                e.N(1, (byte)2);
                d.z(adDecision.hide_gold, e);
            }
            if (adDecision.hide_mod != null) {
                e.N(2, (byte)2);
                d.z(adDecision.hide_mod, e);
            }
            if (adDecision.hide_news != null) {
                e.N(3, (byte)2);
                d.z(adDecision.hide_news, e);
            }
            if (adDecision.hide_whitelist != null) {
                e.N(4, (byte)2);
                d.z(adDecision.hide_whitelist, e);
            }
            if (adDecision.hide_sort != null) {
                e.N(5, (byte)2);
                d.z(adDecision.hide_sort, e);
            }
            if (adDecision.hide_experiment != null) {
                e.N(6, (byte)2);
                d.z(adDecision.hide_experiment, e);
            }
            if (adDecision.hide_other != null) {
                e.N(7, (byte)2);
                d.z(adDecision.hide_other, e);
            }
            if (adDecision.hide_source_post != null) {
                e.N(8, (byte)2);
                d.z(adDecision.hide_source_post, e);
            }
            if (adDecision.hide_bad_keywords != null) {
                e.N(9, (byte)2);
                d.z(adDecision.hide_bad_keywords, e);
            }
            if (adDecision.hide_full_bleed != null) {
                e.N(10, (byte)2);
                d.z(adDecision.hide_full_bleed, e);
            }
            if (adDecision.hide_nsfw != null) {
                e.N(11, (byte)2);
                d.z(adDecision.hide_nsfw, e);
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AdDecision>
    {
        private Boolean hide_bad_keywords;
        private Boolean hide_experiment;
        private Boolean hide_full_bleed;
        private Boolean hide_gold;
        private Boolean hide_mod;
        private Boolean hide_news;
        private Boolean hide_nsfw;
        private Boolean hide_other;
        private Boolean hide_sort;
        private Boolean hide_source_post;
        private Boolean hide_whitelist;
        
        public Builder() {
        }
        
        public Builder(final AdDecision adDecision) {
            this.hide_gold = adDecision.hide_gold;
            this.hide_mod = adDecision.hide_mod;
            this.hide_news = adDecision.hide_news;
            this.hide_whitelist = adDecision.hide_whitelist;
            this.hide_sort = adDecision.hide_sort;
            this.hide_experiment = adDecision.hide_experiment;
            this.hide_other = adDecision.hide_other;
            this.hide_source_post = adDecision.hide_source_post;
            this.hide_bad_keywords = adDecision.hide_bad_keywords;
            this.hide_full_bleed = adDecision.hide_full_bleed;
            this.hide_nsfw = adDecision.hide_nsfw;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.hide_gold;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.hide_full_bleed;
        }
        
        public static /* synthetic */ Boolean access$1100(final Builder builder) {
            return builder.hide_nsfw;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.hide_mod;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.hide_news;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.hide_whitelist;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.hide_sort;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.hide_experiment;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.hide_other;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.hide_source_post;
        }
        
        public static /* synthetic */ Boolean access$900(final Builder builder) {
            return builder.hide_bad_keywords;
        }
        
        public AdDecision build() {
            return new AdDecision(this, null);
        }
        
        public Builder hide_bad_keywords(final Boolean hide_bad_keywords) {
            this.hide_bad_keywords = hide_bad_keywords;
            return this;
        }
        
        public Builder hide_experiment(final Boolean hide_experiment) {
            this.hide_experiment = hide_experiment;
            return this;
        }
        
        public Builder hide_full_bleed(final Boolean hide_full_bleed) {
            this.hide_full_bleed = hide_full_bleed;
            return this;
        }
        
        public Builder hide_gold(final Boolean hide_gold) {
            this.hide_gold = hide_gold;
            return this;
        }
        
        public Builder hide_mod(final Boolean hide_mod) {
            this.hide_mod = hide_mod;
            return this;
        }
        
        public Builder hide_news(final Boolean hide_news) {
            this.hide_news = hide_news;
            return this;
        }
        
        public Builder hide_nsfw(final Boolean hide_nsfw) {
            this.hide_nsfw = hide_nsfw;
            return this;
        }
        
        public Builder hide_other(final Boolean hide_other) {
            this.hide_other = hide_other;
            return this;
        }
        
        public Builder hide_sort(final Boolean hide_sort) {
            this.hide_sort = hide_sort;
            return this;
        }
        
        public Builder hide_source_post(final Boolean hide_source_post) {
            this.hide_source_post = hide_source_post;
            return this;
        }
        
        public Builder hide_whitelist(final Boolean hide_whitelist) {
            this.hide_whitelist = hide_whitelist;
            return this;
        }
        
        public void reset() {
            this.hide_gold = null;
            this.hide_mod = null;
            this.hide_news = null;
            this.hide_whitelist = null;
            this.hide_sort = null;
            this.hide_experiment = null;
            this.hide_other = null;
            this.hide_source_post = null;
            this.hide_bad_keywords = null;
            this.hide_full_bleed = null;
            this.hide_nsfw = null;
        }
    }
}
