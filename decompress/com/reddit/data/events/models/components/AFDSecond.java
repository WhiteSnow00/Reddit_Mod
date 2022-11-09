// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import kt.b;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class AFDSecond
{
    public static final a<AFDSecond, Builder> ADAPTER;
    public final Integer image_id;
    public final List<Integer> image_ids;
    public final String image_name;
    public final List<String> image_names;
    public final List<Integer> image_ranks;
    public final Integer image_set_id;
    public final String image_set_name;
    public final Long round_end_timestamp;
    public final Integer round_id;
    public final Long round_start_timestamp;
    public final List<Integer> vote_counts;
    public final Integer winning_image_id;
    public final String winning_image_name;
    
    static {
        ADAPTER = (a)new AFDSecondAdapter(null);
    }
    
    private AFDSecond(final Builder builder) {
        this.round_id = Builder.access$100(builder);
        this.round_start_timestamp = Builder.access$200(builder);
        this.round_end_timestamp = Builder.access$300(builder);
        final List access$400 = Builder.access$400(builder);
        final List<Integer> list = null;
        List<Integer> unmodifiableList;
        if (access$400 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends Integer>)Builder.access$400(builder));
        }
        this.image_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$500(builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$500(builder));
        }
        this.image_names = unmodifiableList2;
        List<Integer> unmodifiableList3;
        if (Builder.access$600(builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends Integer>)Builder.access$600(builder));
        }
        this.vote_counts = unmodifiableList3;
        this.image_id = Builder.access$700(builder);
        this.image_name = Builder.access$800(builder);
        List<Integer> unmodifiableList4;
        if (Builder.access$900(builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends Integer>)Builder.access$900(builder));
        }
        this.image_ranks = unmodifiableList4;
        this.winning_image_id = Builder.access$1000(builder);
        this.winning_image_name = Builder.access$1100(builder);
        this.image_set_name = Builder.access$1200(builder);
        this.image_set_id = Builder.access$1300(builder);
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
        if (!(o instanceof AFDSecond)) {
            return false;
        }
        final AFDSecond afdSecond = (AFDSecond)o;
        final Integer round_id = this.round_id;
        final Integer round_id2 = afdSecond.round_id;
        if (round_id == round_id2 || (round_id != null && round_id.equals(round_id2))) {
            final Long round_start_timestamp = this.round_start_timestamp;
            final Long round_start_timestamp2 = afdSecond.round_start_timestamp;
            if (round_start_timestamp == round_start_timestamp2 || (round_start_timestamp != null && round_start_timestamp.equals(round_start_timestamp2))) {
                final Long round_end_timestamp = this.round_end_timestamp;
                final Long round_end_timestamp2 = afdSecond.round_end_timestamp;
                if (round_end_timestamp == round_end_timestamp2 || (round_end_timestamp != null && round_end_timestamp.equals(round_end_timestamp2))) {
                    final List<Integer> image_ids = this.image_ids;
                    final List<Integer> image_ids2 = afdSecond.image_ids;
                    if (image_ids == image_ids2 || (image_ids != null && image_ids.equals(image_ids2))) {
                        final List<String> image_names = this.image_names;
                        final List<String> image_names2 = afdSecond.image_names;
                        if (image_names == image_names2 || (image_names != null && image_names.equals(image_names2))) {
                            final List<Integer> vote_counts = this.vote_counts;
                            final List<Integer> vote_counts2 = afdSecond.vote_counts;
                            if (vote_counts == vote_counts2 || (vote_counts != null && vote_counts.equals(vote_counts2))) {
                                final Integer image_id = this.image_id;
                                final Integer image_id2 = afdSecond.image_id;
                                if (image_id == image_id2 || (image_id != null && image_id.equals(image_id2))) {
                                    final String image_name = this.image_name;
                                    final String image_name2 = afdSecond.image_name;
                                    if (image_name == image_name2 || (image_name != null && image_name.equals(image_name2))) {
                                        final List<Integer> image_ranks = this.image_ranks;
                                        final List<Integer> image_ranks2 = afdSecond.image_ranks;
                                        if (image_ranks == image_ranks2 || (image_ranks != null && image_ranks.equals(image_ranks2))) {
                                            final Integer winning_image_id = this.winning_image_id;
                                            final Integer winning_image_id2 = afdSecond.winning_image_id;
                                            if (winning_image_id == winning_image_id2 || (winning_image_id != null && winning_image_id.equals(winning_image_id2))) {
                                                final String winning_image_name = this.winning_image_name;
                                                final String winning_image_name2 = afdSecond.winning_image_name;
                                                if (winning_image_name == winning_image_name2 || (winning_image_name != null && winning_image_name.equals(winning_image_name2))) {
                                                    final String image_set_name = this.image_set_name;
                                                    final String image_set_name2 = afdSecond.image_set_name;
                                                    if (image_set_name == image_set_name2 || (image_set_name != null && image_set_name.equals(image_set_name2))) {
                                                        final Integer image_set_id = this.image_set_id;
                                                        final Integer image_set_id2 = afdSecond.image_set_id;
                                                        boolean b2 = b;
                                                        if (image_set_id == image_set_id2) {
                                                            return b2;
                                                        }
                                                        if (image_set_id != null && image_set_id.equals(image_set_id2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer round_id = this.round_id;
        int hashCode = 0;
        int hashCode2;
        if (round_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = round_id.hashCode();
        }
        final Long round_start_timestamp = this.round_start_timestamp;
        int hashCode3;
        if (round_start_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = round_start_timestamp.hashCode();
        }
        final Long round_end_timestamp = this.round_end_timestamp;
        int hashCode4;
        if (round_end_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = round_end_timestamp.hashCode();
        }
        final List<Integer> image_ids = this.image_ids;
        int hashCode5;
        if (image_ids == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = image_ids.hashCode();
        }
        final List<String> image_names = this.image_names;
        int hashCode6;
        if (image_names == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = image_names.hashCode();
        }
        final List<Integer> vote_counts = this.vote_counts;
        int hashCode7;
        if (vote_counts == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = vote_counts.hashCode();
        }
        final Integer image_id = this.image_id;
        int hashCode8;
        if (image_id == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = image_id.hashCode();
        }
        final String image_name = this.image_name;
        int hashCode9;
        if (image_name == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = image_name.hashCode();
        }
        final List<Integer> image_ranks = this.image_ranks;
        int hashCode10;
        if (image_ranks == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = image_ranks.hashCode();
        }
        final Integer winning_image_id = this.winning_image_id;
        int hashCode11;
        if (winning_image_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = winning_image_id.hashCode();
        }
        final String winning_image_name = this.winning_image_name;
        int hashCode12;
        if (winning_image_name == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = winning_image_name.hashCode();
        }
        final String image_set_name = this.image_set_name;
        int hashCode13;
        if (image_set_name == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = image_set_name.hashCode();
        }
        final Integer image_set_id = this.image_set_id;
        if (image_set_id != null) {
            hashCode = image_set_id.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AFDSecond{round_id=");
        k.append(this.round_id);
        k.append(", round_start_timestamp=");
        k.append(this.round_start_timestamp);
        k.append(", round_end_timestamp=");
        k.append(this.round_end_timestamp);
        k.append(", image_ids=");
        k.append(this.image_ids);
        k.append(", image_names=");
        k.append(this.image_names);
        k.append(", vote_counts=");
        k.append(this.vote_counts);
        k.append(", image_id=");
        k.append(this.image_id);
        k.append(", image_name=");
        k.append(this.image_name);
        k.append(", image_ranks=");
        k.append(this.image_ranks);
        k.append(", winning_image_id=");
        k.append(this.winning_image_id);
        k.append(", winning_image_name=");
        k.append(this.winning_image_name);
        k.append(", image_set_name=");
        k.append(this.image_set_name);
        k.append(", image_set_id=");
        k.append(this.image_set_id);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AFDSecond.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AFDSecondAdapter implements a<AFDSecond, Builder>
    {
        private AFDSecondAdapter() {
        }
        
        public AFDSecond read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AFDSecond read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                int i = 0;
                switch (b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 8) {
                            builder.image_set_id(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.image_set_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.winning_image_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 8) {
                            builder.winning_image_id(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList<Integer>(w.b);
                            while (i < w.b) {
                                list.add(e.t());
                                ++i;
                            }
                            e.x();
                            builder.image_ranks((List<Integer>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.image_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 8) {
                            builder.image_id(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList<Integer>(w2.b);
                            for (int j = n; j < w2.b; ++j) {
                                list2.add(e.t());
                            }
                            e.x();
                            builder.vote_counts((List<Integer>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 15) {
                            final c w3 = e.w();
                            final ArrayList list3 = new ArrayList(w3.b);
                            for (int k = n2; k < w3.b; k = d.h(e, list3, k, 1)) {}
                            e.x();
                            builder.image_names((List<String>)list3);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 15) {
                            final c w4 = e.w();
                            final ArrayList list4 = new ArrayList<Integer>(w4.b);
                            for (int l = n3; l < w4.b; ++l) {
                                list4.add(e.t());
                            }
                            e.x();
                            builder.image_ids((List<Integer>)list4);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.round_end_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.round_start_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 8) {
                            builder.round_id(e.t());
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
        
        public void write(final e e, final AFDSecond afdSecond) throws IOException {
            e.a0();
            if (afdSecond.round_id != null) {
                e.N(1, (byte)8);
                b.r(afdSecond.round_id, e);
            }
            if (afdSecond.round_start_timestamp != null) {
                e.N(2, (byte)10);
                a.r(afdSecond.round_start_timestamp, e);
            }
            if (afdSecond.round_end_timestamp != null) {
                e.N(3, (byte)10);
                a.r(afdSecond.round_end_timestamp, e);
            }
            if (afdSecond.image_ids != null) {
                e.N(4, (byte)15);
                e.V((byte)8, afdSecond.image_ids.size());
                final Iterator<Integer> iterator = afdSecond.image_ids.iterator();
                while (iterator.hasNext()) {
                    e.Q((int)iterator.next());
                }
                e.X();
                e.O();
            }
            if (afdSecond.image_names != null) {
                e.N(5, (byte)15);
                e.V((byte)11, afdSecond.image_names.size());
                final Iterator<String> iterator2 = afdSecond.image_names.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (afdSecond.vote_counts != null) {
                e.N(6, (byte)15);
                e.V((byte)8, afdSecond.vote_counts.size());
                final Iterator<Integer> iterator3 = afdSecond.vote_counts.iterator();
                while (iterator3.hasNext()) {
                    e.Q((int)iterator3.next());
                }
                e.X();
                e.O();
            }
            if (afdSecond.image_id != null) {
                e.N(7, (byte)8);
                b.r(afdSecond.image_id, e);
            }
            if (afdSecond.image_name != null) {
                e.N(8, (byte)11);
                e.Z(afdSecond.image_name);
                e.O();
            }
            if (afdSecond.image_ranks != null) {
                e.N(9, (byte)15);
                e.V((byte)8, afdSecond.image_ranks.size());
                final Iterator<Integer> iterator4 = afdSecond.image_ranks.iterator();
                while (iterator4.hasNext()) {
                    e.Q((int)iterator4.next());
                }
                e.X();
                e.O();
            }
            if (afdSecond.winning_image_id != null) {
                e.N(10, (byte)8);
                b.r(afdSecond.winning_image_id, e);
            }
            if (afdSecond.winning_image_name != null) {
                e.N(11, (byte)11);
                e.Z(afdSecond.winning_image_name);
                e.O();
            }
            if (afdSecond.image_set_name != null) {
                e.N(12, (byte)11);
                e.Z(afdSecond.image_set_name);
                e.O();
            }
            if (afdSecond.image_set_id != null) {
                e.N(13, (byte)8);
                b.r(afdSecond.image_set_id, e);
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AFDSecond>
    {
        private Integer image_id;
        private List<Integer> image_ids;
        private String image_name;
        private List<String> image_names;
        private List<Integer> image_ranks;
        private Integer image_set_id;
        private String image_set_name;
        private Long round_end_timestamp;
        private Integer round_id;
        private Long round_start_timestamp;
        private List<Integer> vote_counts;
        private Integer winning_image_id;
        private String winning_image_name;
        
        public Builder() {
        }
        
        public Builder(final AFDSecond afdSecond) {
            this.round_id = afdSecond.round_id;
            this.round_start_timestamp = afdSecond.round_start_timestamp;
            this.round_end_timestamp = afdSecond.round_end_timestamp;
            this.image_ids = afdSecond.image_ids;
            this.image_names = afdSecond.image_names;
            this.vote_counts = afdSecond.vote_counts;
            this.image_id = afdSecond.image_id;
            this.image_name = afdSecond.image_name;
            this.image_ranks = afdSecond.image_ranks;
            this.winning_image_id = afdSecond.winning_image_id;
            this.winning_image_name = afdSecond.winning_image_name;
            this.image_set_name = afdSecond.image_set_name;
            this.image_set_id = afdSecond.image_set_id;
        }
        
        public static /* synthetic */ Integer access$100(final Builder builder) {
            return builder.round_id;
        }
        
        public static /* synthetic */ Integer access$1000(final Builder builder) {
            return builder.winning_image_id;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.winning_image_name;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.image_set_name;
        }
        
        public static /* synthetic */ Integer access$1300(final Builder builder) {
            return builder.image_set_id;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.round_start_timestamp;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.round_end_timestamp;
        }
        
        public static /* synthetic */ List access$400(final Builder builder) {
            return builder.image_ids;
        }
        
        public static /* synthetic */ List access$500(final Builder builder) {
            return builder.image_names;
        }
        
        public static /* synthetic */ List access$600(final Builder builder) {
            return builder.vote_counts;
        }
        
        public static /* synthetic */ Integer access$700(final Builder builder) {
            return builder.image_id;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.image_name;
        }
        
        public static /* synthetic */ List access$900(final Builder builder) {
            return builder.image_ranks;
        }
        
        public AFDSecond build() {
            return new AFDSecond(this, null);
        }
        
        public Builder image_id(final Integer image_id) {
            this.image_id = image_id;
            return this;
        }
        
        public Builder image_ids(final List<Integer> image_ids) {
            this.image_ids = image_ids;
            return this;
        }
        
        public Builder image_name(final String image_name) {
            this.image_name = image_name;
            return this;
        }
        
        public Builder image_names(final List<String> image_names) {
            this.image_names = image_names;
            return this;
        }
        
        public Builder image_ranks(final List<Integer> image_ranks) {
            this.image_ranks = image_ranks;
            return this;
        }
        
        public Builder image_set_id(final Integer image_set_id) {
            this.image_set_id = image_set_id;
            return this;
        }
        
        public Builder image_set_name(final String image_set_name) {
            this.image_set_name = image_set_name;
            return this;
        }
        
        public void reset() {
            this.round_id = null;
            this.round_start_timestamp = null;
            this.round_end_timestamp = null;
            this.image_ids = null;
            this.image_names = null;
            this.vote_counts = null;
            this.image_id = null;
            this.image_name = null;
            this.image_ranks = null;
            this.winning_image_id = null;
            this.winning_image_name = null;
            this.image_set_name = null;
            this.image_set_id = null;
        }
        
        public Builder round_end_timestamp(final Long round_end_timestamp) {
            this.round_end_timestamp = round_end_timestamp;
            return this;
        }
        
        public Builder round_id(final Integer round_id) {
            this.round_id = round_id;
            return this;
        }
        
        public Builder round_start_timestamp(final Long round_start_timestamp) {
            this.round_start_timestamp = round_start_timestamp;
            return this;
        }
        
        public Builder vote_counts(final List<Integer> vote_counts) {
            this.vote_counts = vote_counts;
            return this;
        }
        
        public Builder winning_image_id(final Integer winning_image_id) {
            this.winning_image_id = winning_image_id;
            return this;
        }
        
        public Builder winning_image_name(final String winning_image_name) {
            this.winning_image_name = winning_image_name;
            return this;
        }
    }
}
