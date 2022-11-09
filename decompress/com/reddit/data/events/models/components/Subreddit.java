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
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Subreddit
{
    public static final a<Subreddit, Builder> ADAPTER;
    public final String access_type;
    public final String category_name;
    public final String id;
    public final String name;
    public final Boolean nsfw;
    public final Integer number_coins;
    public final String post_difficulty_rating;
    public final String public_description;
    public final Boolean quarantined;
    public final Integer subscriber_count;
    public final List<String> topic_tag_contents;
    public final List<String> topic_tag_ids;
    public final String topic_tag_primary_id;
    public final List<String> topic_tag_types;
    public final String whitelist_status;
    
    static {
        ADAPTER = (a)new SubredditAdapter(null);
    }
    
    private Subreddit(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
        this.category_name = Builder.access$300(builder);
        this.whitelist_status = Builder.access$400(builder);
        this.access_type = Builder.access$500(builder);
        this.quarantined = Builder.access$600(builder);
        this.nsfw = Builder.access$700(builder);
        final List access$800 = Builder.access$800(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$800 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$800(builder));
        }
        this.topic_tag_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$900(builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$900(builder));
        }
        this.topic_tag_contents = unmodifiableList2;
        List<String> unmodifiableList3;
        if (Builder.access$1000(builder) == null) {
            unmodifiableList3 = list;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Builder.access$1000(builder));
        }
        this.topic_tag_types = unmodifiableList3;
        this.number_coins = Builder.access$1100(builder);
        this.public_description = Builder.access$1200(builder);
        this.post_difficulty_rating = Builder.access$1300(builder);
        this.topic_tag_primary_id = Builder.access$1400(builder);
        this.subscriber_count = Builder.access$1500(builder);
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
        if (!(o instanceof Subreddit)) {
            return false;
        }
        final Subreddit subreddit = (Subreddit)o;
        final String id = this.id;
        final String id2 = subreddit.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = subreddit.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String category_name = this.category_name;
                final String category_name2 = subreddit.category_name;
                if (category_name == category_name2 || (category_name != null && category_name.equals(category_name2))) {
                    final String whitelist_status = this.whitelist_status;
                    final String whitelist_status2 = subreddit.whitelist_status;
                    if (whitelist_status == whitelist_status2 || (whitelist_status != null && whitelist_status.equals(whitelist_status2))) {
                        final String access_type = this.access_type;
                        final String access_type2 = subreddit.access_type;
                        if (access_type == access_type2 || (access_type != null && access_type.equals(access_type2))) {
                            final Boolean quarantined = this.quarantined;
                            final Boolean quarantined2 = subreddit.quarantined;
                            if (quarantined == quarantined2 || (quarantined != null && quarantined.equals(quarantined2))) {
                                final Boolean nsfw = this.nsfw;
                                final Boolean nsfw2 = subreddit.nsfw;
                                if (nsfw == nsfw2 || (nsfw != null && nsfw.equals(nsfw2))) {
                                    final List<String> topic_tag_ids = this.topic_tag_ids;
                                    final List<String> topic_tag_ids2 = subreddit.topic_tag_ids;
                                    if (topic_tag_ids == topic_tag_ids2 || (topic_tag_ids != null && topic_tag_ids.equals(topic_tag_ids2))) {
                                        final List<String> topic_tag_contents = this.topic_tag_contents;
                                        final List<String> topic_tag_contents2 = subreddit.topic_tag_contents;
                                        if (topic_tag_contents == topic_tag_contents2 || (topic_tag_contents != null && topic_tag_contents.equals(topic_tag_contents2))) {
                                            final List<String> topic_tag_types = this.topic_tag_types;
                                            final List<String> topic_tag_types2 = subreddit.topic_tag_types;
                                            if (topic_tag_types == topic_tag_types2 || (topic_tag_types != null && topic_tag_types.equals(topic_tag_types2))) {
                                                final Integer number_coins = this.number_coins;
                                                final Integer number_coins2 = subreddit.number_coins;
                                                if (number_coins == number_coins2 || (number_coins != null && number_coins.equals(number_coins2))) {
                                                    final String public_description = this.public_description;
                                                    final String public_description2 = subreddit.public_description;
                                                    if (public_description == public_description2 || (public_description != null && public_description.equals(public_description2))) {
                                                        final String post_difficulty_rating = this.post_difficulty_rating;
                                                        final String post_difficulty_rating2 = subreddit.post_difficulty_rating;
                                                        if (post_difficulty_rating == post_difficulty_rating2 || (post_difficulty_rating != null && post_difficulty_rating.equals(post_difficulty_rating2))) {
                                                            final String topic_tag_primary_id = this.topic_tag_primary_id;
                                                            final String topic_tag_primary_id2 = subreddit.topic_tag_primary_id;
                                                            if (topic_tag_primary_id == topic_tag_primary_id2 || (topic_tag_primary_id != null && topic_tag_primary_id.equals(topic_tag_primary_id2))) {
                                                                final Integer subscriber_count = this.subscriber_count;
                                                                final Integer subscriber_count2 = subreddit.subscriber_count;
                                                                boolean b2 = b;
                                                                if (subscriber_count == subscriber_count2) {
                                                                    return b2;
                                                                }
                                                                if (subscriber_count != null && subscriber_count.equals(subscriber_count2)) {
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
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String category_name = this.category_name;
        int hashCode4;
        if (category_name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = category_name.hashCode();
        }
        final String whitelist_status = this.whitelist_status;
        int hashCode5;
        if (whitelist_status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = whitelist_status.hashCode();
        }
        final String access_type = this.access_type;
        int hashCode6;
        if (access_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = access_type.hashCode();
        }
        final Boolean quarantined = this.quarantined;
        int hashCode7;
        if (quarantined == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = quarantined.hashCode();
        }
        final Boolean nsfw = this.nsfw;
        int hashCode8;
        if (nsfw == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = nsfw.hashCode();
        }
        final List<String> topic_tag_ids = this.topic_tag_ids;
        int hashCode9;
        if (topic_tag_ids == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = topic_tag_ids.hashCode();
        }
        final List<String> topic_tag_contents = this.topic_tag_contents;
        int hashCode10;
        if (topic_tag_contents == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = topic_tag_contents.hashCode();
        }
        final List<String> topic_tag_types = this.topic_tag_types;
        int hashCode11;
        if (topic_tag_types == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = topic_tag_types.hashCode();
        }
        final Integer number_coins = this.number_coins;
        int hashCode12;
        if (number_coins == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = number_coins.hashCode();
        }
        final String public_description = this.public_description;
        int hashCode13;
        if (public_description == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = public_description.hashCode();
        }
        final String post_difficulty_rating = this.post_difficulty_rating;
        int hashCode14;
        if (post_difficulty_rating == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = post_difficulty_rating.hashCode();
        }
        final String topic_tag_primary_id = this.topic_tag_primary_id;
        int hashCode15;
        if (topic_tag_primary_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = topic_tag_primary_id.hashCode();
        }
        final Integer subscriber_count = this.subscriber_count;
        if (subscriber_count != null) {
            hashCode = subscriber_count.hashCode();
        }
        return (((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Subreddit{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", category_name=");
        k.append(this.category_name);
        k.append(", whitelist_status=");
        k.append(this.whitelist_status);
        k.append(", access_type=");
        k.append(this.access_type);
        k.append(", quarantined=");
        k.append(this.quarantined);
        k.append(", nsfw=");
        k.append(this.nsfw);
        k.append(", topic_tag_ids=");
        k.append(this.topic_tag_ids);
        k.append(", topic_tag_contents=");
        k.append(this.topic_tag_contents);
        k.append(", topic_tag_types=");
        k.append(this.topic_tag_types);
        k.append(", number_coins=");
        k.append(this.number_coins);
        k.append(", public_description=");
        k.append(this.public_description);
        k.append(", post_difficulty_rating=");
        k.append(this.post_difficulty_rating);
        k.append(", topic_tag_primary_id=");
        k.append(this.topic_tag_primary_id);
        k.append(", subscriber_count=");
        k.append(this.subscriber_count);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Subreddit.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Subreddit>
    {
        private String access_type;
        private String category_name;
        private String id;
        private String name;
        private Boolean nsfw;
        private Integer number_coins;
        private String post_difficulty_rating;
        private String public_description;
        private Boolean quarantined;
        private Integer subscriber_count;
        private List<String> topic_tag_contents;
        private List<String> topic_tag_ids;
        private String topic_tag_primary_id;
        private List<String> topic_tag_types;
        private String whitelist_status;
        
        public Builder() {
        }
        
        public Builder(final Subreddit subreddit) {
            this.id = subreddit.id;
            this.name = subreddit.name;
            this.category_name = subreddit.category_name;
            this.whitelist_status = subreddit.whitelist_status;
            this.access_type = subreddit.access_type;
            this.quarantined = subreddit.quarantined;
            this.nsfw = subreddit.nsfw;
            this.topic_tag_ids = subreddit.topic_tag_ids;
            this.topic_tag_contents = subreddit.topic_tag_contents;
            this.topic_tag_types = subreddit.topic_tag_types;
            this.number_coins = subreddit.number_coins;
            this.public_description = subreddit.public_description;
            this.post_difficulty_rating = subreddit.post_difficulty_rating;
            this.topic_tag_primary_id = subreddit.topic_tag_primary_id;
            this.subscriber_count = subreddit.subscriber_count;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ List access$1000(final Builder builder) {
            return builder.topic_tag_types;
        }
        
        public static /* synthetic */ Integer access$1100(final Builder builder) {
            return builder.number_coins;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.public_description;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.post_difficulty_rating;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.topic_tag_primary_id;
        }
        
        public static /* synthetic */ Integer access$1500(final Builder builder) {
            return builder.subscriber_count;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.category_name;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.whitelist_status;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.access_type;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.quarantined;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.nsfw;
        }
        
        public static /* synthetic */ List access$800(final Builder builder) {
            return builder.topic_tag_ids;
        }
        
        public static /* synthetic */ List access$900(final Builder builder) {
            return builder.topic_tag_contents;
        }
        
        public Builder access_type(final String access_type) {
            this.access_type = access_type;
            return this;
        }
        
        public Subreddit build() {
            return new Subreddit(this, null);
        }
        
        public Builder category_name(final String category_name) {
            this.category_name = category_name;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder nsfw(final Boolean nsfw) {
            this.nsfw = nsfw;
            return this;
        }
        
        public Builder number_coins(final Integer number_coins) {
            this.number_coins = number_coins;
            return this;
        }
        
        public Builder post_difficulty_rating(final String post_difficulty_rating) {
            this.post_difficulty_rating = post_difficulty_rating;
            return this;
        }
        
        public Builder public_description(final String public_description) {
            this.public_description = public_description;
            return this;
        }
        
        public Builder quarantined(final Boolean quarantined) {
            this.quarantined = quarantined;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
            this.category_name = null;
            this.whitelist_status = null;
            this.access_type = null;
            this.quarantined = null;
            this.nsfw = null;
            this.topic_tag_ids = null;
            this.topic_tag_contents = null;
            this.topic_tag_types = null;
            this.number_coins = null;
            this.public_description = null;
            this.post_difficulty_rating = null;
            this.topic_tag_primary_id = null;
            this.subscriber_count = null;
        }
        
        public Builder subscriber_count(final Integer subscriber_count) {
            this.subscriber_count = subscriber_count;
            return this;
        }
        
        public Builder topic_tag_contents(final List<String> topic_tag_contents) {
            this.topic_tag_contents = topic_tag_contents;
            return this;
        }
        
        public Builder topic_tag_ids(final List<String> topic_tag_ids) {
            this.topic_tag_ids = topic_tag_ids;
            return this;
        }
        
        public Builder topic_tag_primary_id(final String topic_tag_primary_id) {
            this.topic_tag_primary_id = topic_tag_primary_id;
            return this;
        }
        
        public Builder topic_tag_types(final List<String> topic_tag_types) {
            this.topic_tag_types = topic_tag_types;
            return this;
        }
        
        public Builder whitelist_status(final String whitelist_status) {
            this.whitelist_status = whitelist_status;
            return this;
        }
    }
    
    public static final class SubredditAdapter implements a<Subreddit, Builder>
    {
        private SubredditAdapter() {
        }
        
        public Subreddit read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Subreddit read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                final int n2 = 0;
                int i = 0;
                switch (b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 8) {
                            builder.subscriber_count(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.topic_tag_primary_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.post_difficulty_rating(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.public_description(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 8) {
                            builder.number_coins(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.topic_tag_types((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.topic_tag_contents((List<String>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 15) {
                            final c w3 = e.w();
                            final ArrayList list3 = new ArrayList(w3.b);
                            for (int k = n2; k < w3.b; k = d.h(e, list3, k, 1)) {}
                            e.x();
                            builder.topic_tag_ids((List<String>)list3);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.nsfw(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.quarantined(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.access_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.whitelist_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.category_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
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
        
        public void write(final e e, final Subreddit subreddit) throws IOException {
            e.a0();
            if (subreddit.id != null) {
                e.N(1, (byte)11);
                e.Z(subreddit.id);
                e.O();
            }
            if (subreddit.name != null) {
                e.N(2, (byte)11);
                e.Z(subreddit.name);
                e.O();
            }
            if (subreddit.category_name != null) {
                e.N(3, (byte)11);
                e.Z(subreddit.category_name);
                e.O();
            }
            if (subreddit.whitelist_status != null) {
                e.N(4, (byte)11);
                e.Z(subreddit.whitelist_status);
                e.O();
            }
            if (subreddit.access_type != null) {
                e.N(5, (byte)11);
                e.Z(subreddit.access_type);
                e.O();
            }
            if (subreddit.quarantined != null) {
                e.N(6, (byte)2);
                d.z(subreddit.quarantined, e);
            }
            if (subreddit.nsfw != null) {
                e.N(7, (byte)2);
                d.z(subreddit.nsfw, e);
            }
            if (subreddit.topic_tag_ids != null) {
                e.N(8, (byte)15);
                e.V((byte)11, subreddit.topic_tag_ids.size());
                final Iterator<String> iterator = subreddit.topic_tag_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (subreddit.topic_tag_contents != null) {
                e.N(9, (byte)15);
                e.V((byte)11, subreddit.topic_tag_contents.size());
                final Iterator<String> iterator2 = subreddit.topic_tag_contents.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (subreddit.topic_tag_types != null) {
                e.N(10, (byte)15);
                e.V((byte)11, subreddit.topic_tag_types.size());
                final Iterator<String> iterator3 = subreddit.topic_tag_types.iterator();
                while (iterator3.hasNext()) {
                    e.Z((String)iterator3.next());
                }
                e.X();
                e.O();
            }
            if (subreddit.number_coins != null) {
                e.N(11, (byte)8);
                b.r(subreddit.number_coins, e);
            }
            if (subreddit.public_description != null) {
                e.N(12, (byte)11);
                e.Z(subreddit.public_description);
                e.O();
            }
            if (subreddit.post_difficulty_rating != null) {
                e.N(13, (byte)11);
                e.Z(subreddit.post_difficulty_rating);
                e.O();
            }
            if (subreddit.topic_tag_primary_id != null) {
                e.N(14, (byte)11);
                e.Z(subreddit.topic_tag_primary_id);
                e.O();
            }
            if (subreddit.subscriber_count != null) {
                e.N(15, (byte)8);
                b.r(subreddit.subscriber_count, e);
            }
            e.P();
            e.b0();
        }
    }
}
