// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import jt.b;
import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Taxonomy
{
    public static final a<Taxonomy, Builder> ADAPTER;
    public final String allowlist_status;
    public final List<String> mature_themes;
    public final List<String> primary_topics;
    public final String rating;
    public final String subreddit_id;
    public final String subreddit_name;
    public final String subreddit_whitelist_status;
    public final String version;
    
    static {
        ADAPTER = (a)new TaxonomyAdapter(null);
    }
    
    private Taxonomy(final Builder builder) {
        this.subreddit_id = Builder.access$100(builder);
        this.subreddit_name = Builder.access$200(builder);
        this.subreddit_whitelist_status = Builder.access$300(builder);
        this.version = Builder.access$400(builder);
        this.rating = Builder.access$500(builder);
        this.allowlist_status = Builder.access$600(builder);
        final List access$700 = Builder.access$700(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$700 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$700(builder));
        }
        this.primary_topics = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$800(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$800(builder));
        }
        this.mature_themes = unmodifiableList2;
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
        if (!(o instanceof Taxonomy)) {
            return false;
        }
        final Taxonomy taxonomy = (Taxonomy)o;
        final String subreddit_id = this.subreddit_id;
        final String subreddit_id2 = taxonomy.subreddit_id;
        if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
            final String subreddit_name = this.subreddit_name;
            final String subreddit_name2 = taxonomy.subreddit_name;
            if (subreddit_name == subreddit_name2 || (subreddit_name != null && subreddit_name.equals(subreddit_name2))) {
                final String subreddit_whitelist_status = this.subreddit_whitelist_status;
                final String subreddit_whitelist_status2 = taxonomy.subreddit_whitelist_status;
                if (subreddit_whitelist_status == subreddit_whitelist_status2 || (subreddit_whitelist_status != null && subreddit_whitelist_status.equals(subreddit_whitelist_status2))) {
                    final String version = this.version;
                    final String version2 = taxonomy.version;
                    if (version == version2 || (version != null && version.equals(version2))) {
                        final String rating = this.rating;
                        final String rating2 = taxonomy.rating;
                        if (rating == rating2 || (rating != null && rating.equals(rating2))) {
                            final String allowlist_status = this.allowlist_status;
                            final String allowlist_status2 = taxonomy.allowlist_status;
                            if (allowlist_status == allowlist_status2 || (allowlist_status != null && allowlist_status.equals(allowlist_status2))) {
                                final List<String> primary_topics = this.primary_topics;
                                final List<String> primary_topics2 = taxonomy.primary_topics;
                                if (primary_topics == primary_topics2 || (primary_topics != null && primary_topics.equals(primary_topics2))) {
                                    final List<String> mature_themes = this.mature_themes;
                                    final List<String> mature_themes2 = taxonomy.mature_themes;
                                    boolean b2 = b;
                                    if (mature_themes == mature_themes2) {
                                        return b2;
                                    }
                                    if (mature_themes != null && mature_themes.equals(mature_themes2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String subreddit_id = this.subreddit_id;
        int hashCode = 0;
        int hashCode2;
        if (subreddit_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subreddit_id.hashCode();
        }
        final String subreddit_name = this.subreddit_name;
        int hashCode3;
        if (subreddit_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subreddit_name.hashCode();
        }
        final String subreddit_whitelist_status = this.subreddit_whitelist_status;
        int hashCode4;
        if (subreddit_whitelist_status == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subreddit_whitelist_status.hashCode();
        }
        final String version = this.version;
        int hashCode5;
        if (version == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = version.hashCode();
        }
        final String rating = this.rating;
        int hashCode6;
        if (rating == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = rating.hashCode();
        }
        final String allowlist_status = this.allowlist_status;
        int hashCode7;
        if (allowlist_status == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = allowlist_status.hashCode();
        }
        final List<String> primary_topics = this.primary_topics;
        int hashCode8;
        if (primary_topics == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = primary_topics.hashCode();
        }
        final List<String> mature_themes = this.mature_themes;
        if (mature_themes != null) {
            hashCode = mature_themes.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Taxonomy{subreddit_id=");
        k.append(this.subreddit_id);
        k.append(", subreddit_name=");
        k.append(this.subreddit_name);
        k.append(", subreddit_whitelist_status=");
        k.append(this.subreddit_whitelist_status);
        k.append(", version=");
        k.append(this.version);
        k.append(", rating=");
        k.append(this.rating);
        k.append(", allowlist_status=");
        k.append(this.allowlist_status);
        k.append(", primary_topics=");
        k.append(this.primary_topics);
        k.append(", mature_themes=");
        return n.r(k, (List)this.mature_themes, "}");
    }
    
    public void write(final e e) throws IOException {
        Taxonomy.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Taxonomy>
    {
        private String allowlist_status;
        private List<String> mature_themes;
        private List<String> primary_topics;
        private String rating;
        private String subreddit_id;
        private String subreddit_name;
        private String subreddit_whitelist_status;
        private String version;
        
        public Builder() {
        }
        
        public Builder(final Taxonomy taxonomy) {
            this.subreddit_id = taxonomy.subreddit_id;
            this.subreddit_name = taxonomy.subreddit_name;
            this.subreddit_whitelist_status = taxonomy.subreddit_whitelist_status;
            this.version = taxonomy.version;
            this.rating = taxonomy.rating;
            this.allowlist_status = taxonomy.allowlist_status;
            this.primary_topics = taxonomy.primary_topics;
            this.mature_themes = taxonomy.mature_themes;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.subreddit_name;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.subreddit_whitelist_status;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.version;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.rating;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.allowlist_status;
        }
        
        public static /* synthetic */ List access$700(final Builder builder) {
            return builder.primary_topics;
        }
        
        public static /* synthetic */ List access$800(final Builder builder) {
            return builder.mature_themes;
        }
        
        public Builder allowlist_status(final String allowlist_status) {
            this.allowlist_status = allowlist_status;
            return this;
        }
        
        public Taxonomy build() {
            return new Taxonomy(this, null);
        }
        
        public Builder mature_themes(final List<String> mature_themes) {
            this.mature_themes = mature_themes;
            return this;
        }
        
        public Builder primary_topics(final List<String> primary_topics) {
            this.primary_topics = primary_topics;
            return this;
        }
        
        public Builder rating(final String rating) {
            this.rating = rating;
            return this;
        }
        
        public void reset() {
            this.subreddit_id = null;
            this.subreddit_name = null;
            this.subreddit_whitelist_status = null;
            this.version = null;
            this.rating = null;
            this.allowlist_status = null;
            this.primary_topics = null;
            this.mature_themes = null;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder subreddit_name(final String subreddit_name) {
            this.subreddit_name = subreddit_name;
            return this;
        }
        
        public Builder subreddit_whitelist_status(final String subreddit_whitelist_status) {
            this.subreddit_whitelist_status = subreddit_whitelist_status;
            return this;
        }
        
        public Builder version(final String version) {
            this.version = version;
            return this;
        }
    }
    
    public static final class TaxonomyAdapter implements a<Taxonomy, Builder>
    {
        private TaxonomyAdapter() {
        }
        
        public Taxonomy read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Taxonomy read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                int i = 0;
                switch (b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.mature_themes((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.primary_topics((List<String>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.allowlist_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.rating(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.version(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.subreddit_whitelist_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.subreddit_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
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
        
        public void write(final e e, final Taxonomy taxonomy) throws IOException {
            e.a0();
            if (taxonomy.subreddit_id != null) {
                e.N(1, (byte)11);
                e.Z(taxonomy.subreddit_id);
                e.O();
            }
            if (taxonomy.subreddit_name != null) {
                e.N(2, (byte)11);
                e.Z(taxonomy.subreddit_name);
                e.O();
            }
            if (taxonomy.subreddit_whitelist_status != null) {
                e.N(3, (byte)11);
                e.Z(taxonomy.subreddit_whitelist_status);
                e.O();
            }
            if (taxonomy.version != null) {
                e.N(4, (byte)11);
                e.Z(taxonomy.version);
                e.O();
            }
            if (taxonomy.rating != null) {
                e.N(5, (byte)11);
                e.Z(taxonomy.rating);
                e.O();
            }
            if (taxonomy.allowlist_status != null) {
                e.N(6, (byte)11);
                e.Z(taxonomy.allowlist_status);
                e.O();
            }
            if (taxonomy.primary_topics != null) {
                e.N(7, (byte)15);
                e.V((byte)11, taxonomy.primary_topics.size());
                final Iterator<String> iterator = taxonomy.primary_topics.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (taxonomy.mature_themes != null) {
                e.N(8, (byte)15);
                e.V((byte)11, taxonomy.mature_themes.size());
                final Iterator<String> iterator2 = taxonomy.mature_themes.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
