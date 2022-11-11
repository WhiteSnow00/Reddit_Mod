// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Experiment
{
    public static final a<Experiment, Builder> ADAPTER;
    public final Boolean active;
    public final String bucketing_key;
    public final String bucketing_type;
    public final String bucketing_value;
    public final Long end_timestamp;
    public final String github_link;
    public final Long id;
    public final String info;
    public final Boolean is_override;
    public final String name;
    public final String owner;
    public final String qa_proxy_event;
    public final Long start_timestamp;
    public final String variant;
    public final List<String> variant_names;
    public final List<Double> variant_percentages;
    public final String version;
    
    static {
        ADAPTER = (a)new ExperimentAdapter(null);
    }
    
    private Experiment(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
        this.owner = Builder.access$300(builder);
        this.variant = Builder.access$400(builder);
        this.start_timestamp = Builder.access$500(builder);
        this.end_timestamp = Builder.access$600(builder);
        this.bucketing_key = Builder.access$700(builder);
        this.version = Builder.access$800(builder);
        this.bucketing_value = Builder.access$900(builder);
        this.is_override = Builder.access$1000(builder);
        final List access$1100 = Builder.access$1100(builder);
        final List<Double> list = null;
        List<String> unmodifiableList;
        if (access$1100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$1100(builder));
        }
        this.variant_names = unmodifiableList;
        List<Double> unmodifiableList2;
        if (Builder.access$1200(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends Double>)Builder.access$1200(builder));
        }
        this.variant_percentages = unmodifiableList2;
        this.active = Builder.access$1300(builder);
        this.github_link = Builder.access$1400(builder);
        this.info = Builder.access$1500(builder);
        this.qa_proxy_event = Builder.access$1600(builder);
        this.bucketing_type = Builder.access$1700(builder);
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
        if (!(o instanceof Experiment)) {
            return false;
        }
        final Experiment experiment = (Experiment)o;
        final Long id = this.id;
        final Long id2 = experiment.id;
        if (id == id2 || id.equals(id2)) {
            final String name = this.name;
            final String name2 = experiment.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String owner = this.owner;
                final String owner2 = experiment.owner;
                if (owner == owner2 || (owner != null && owner.equals(owner2))) {
                    final String variant = this.variant;
                    final String variant2 = experiment.variant;
                    if (variant == variant2 || (variant != null && variant.equals(variant2))) {
                        final Long start_timestamp = this.start_timestamp;
                        final Long start_timestamp2 = experiment.start_timestamp;
                        if (start_timestamp == start_timestamp2 || (start_timestamp != null && start_timestamp.equals(start_timestamp2))) {
                            final Long end_timestamp = this.end_timestamp;
                            final Long end_timestamp2 = experiment.end_timestamp;
                            if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                                final String bucketing_key = this.bucketing_key;
                                final String bucketing_key2 = experiment.bucketing_key;
                                if (bucketing_key == bucketing_key2 || (bucketing_key != null && bucketing_key.equals(bucketing_key2))) {
                                    final String version = this.version;
                                    final String version2 = experiment.version;
                                    if (version == version2 || (version != null && version.equals(version2))) {
                                        final String bucketing_value = this.bucketing_value;
                                        final String bucketing_value2 = experiment.bucketing_value;
                                        if (bucketing_value == bucketing_value2 || (bucketing_value != null && bucketing_value.equals(bucketing_value2))) {
                                            final Boolean is_override = this.is_override;
                                            final Boolean is_override2 = experiment.is_override;
                                            if (is_override == is_override2 || (is_override != null && is_override.equals(is_override2))) {
                                                final List<String> variant_names = this.variant_names;
                                                final List<String> variant_names2 = experiment.variant_names;
                                                if (variant_names == variant_names2 || (variant_names != null && variant_names.equals(variant_names2))) {
                                                    final List<Double> variant_percentages = this.variant_percentages;
                                                    final List<Double> variant_percentages2 = experiment.variant_percentages;
                                                    if (variant_percentages == variant_percentages2 || (variant_percentages != null && variant_percentages.equals(variant_percentages2))) {
                                                        final Boolean active = this.active;
                                                        final Boolean active2 = experiment.active;
                                                        if (active == active2 || (active != null && active.equals(active2))) {
                                                            final String github_link = this.github_link;
                                                            final String github_link2 = experiment.github_link;
                                                            if (github_link == github_link2 || (github_link != null && github_link.equals(github_link2))) {
                                                                final String info = this.info;
                                                                final String info2 = experiment.info;
                                                                if (info == info2 || (info != null && info.equals(info2))) {
                                                                    final String qa_proxy_event = this.qa_proxy_event;
                                                                    final String qa_proxy_event2 = experiment.qa_proxy_event;
                                                                    if (qa_proxy_event == qa_proxy_event2 || (qa_proxy_event != null && qa_proxy_event.equals(qa_proxy_event2))) {
                                                                        final String bucketing_type = this.bucketing_type;
                                                                        final String bucketing_type2 = experiment.bucketing_type;
                                                                        boolean b2 = b;
                                                                        if (bucketing_type == bucketing_type2) {
                                                                            return b2;
                                                                        }
                                                                        if (bucketing_type != null && bucketing_type.equals(bucketing_type2)) {
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
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String name = this.name;
        int hashCode2 = 0;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String owner = this.owner;
        int hashCode4;
        if (owner == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = owner.hashCode();
        }
        final String variant = this.variant;
        int hashCode5;
        if (variant == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = variant.hashCode();
        }
        final Long start_timestamp = this.start_timestamp;
        int hashCode6;
        if (start_timestamp == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = start_timestamp.hashCode();
        }
        final Long end_timestamp = this.end_timestamp;
        int hashCode7;
        if (end_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = end_timestamp.hashCode();
        }
        final String bucketing_key = this.bucketing_key;
        int hashCode8;
        if (bucketing_key == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = bucketing_key.hashCode();
        }
        final String version = this.version;
        int hashCode9;
        if (version == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = version.hashCode();
        }
        final String bucketing_value = this.bucketing_value;
        int hashCode10;
        if (bucketing_value == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = bucketing_value.hashCode();
        }
        final Boolean is_override = this.is_override;
        int hashCode11;
        if (is_override == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = is_override.hashCode();
        }
        final List<String> variant_names = this.variant_names;
        int hashCode12;
        if (variant_names == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = variant_names.hashCode();
        }
        final List<Double> variant_percentages = this.variant_percentages;
        int hashCode13;
        if (variant_percentages == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = variant_percentages.hashCode();
        }
        final Boolean active = this.active;
        int hashCode14;
        if (active == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = active.hashCode();
        }
        final String github_link = this.github_link;
        int hashCode15;
        if (github_link == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = github_link.hashCode();
        }
        final String info = this.info;
        int hashCode16;
        if (info == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = info.hashCode();
        }
        final String qa_proxy_event = this.qa_proxy_event;
        int hashCode17;
        if (qa_proxy_event == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = qa_proxy_event.hashCode();
        }
        final String bucketing_type = this.bucketing_type;
        if (bucketing_type != null) {
            hashCode2 = bucketing_type.hashCode();
        }
        return (((((((((((((((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Experiment{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", owner=");
        k.append(this.owner);
        k.append(", variant=");
        k.append(this.variant);
        k.append(", start_timestamp=");
        k.append(this.start_timestamp);
        k.append(", end_timestamp=");
        k.append(this.end_timestamp);
        k.append(", bucketing_key=");
        k.append(this.bucketing_key);
        k.append(", version=");
        k.append(this.version);
        k.append(", bucketing_value=");
        k.append(this.bucketing_value);
        k.append(", is_override=");
        k.append(this.is_override);
        k.append(", variant_names=");
        k.append(this.variant_names);
        k.append(", variant_percentages=");
        k.append(this.variant_percentages);
        k.append(", active=");
        k.append(this.active);
        k.append(", github_link=");
        k.append(this.github_link);
        k.append(", info=");
        k.append(this.info);
        k.append(", qa_proxy_event=");
        k.append(this.qa_proxy_event);
        k.append(", bucketing_type=");
        return b.j(k, this.bucketing_type, "}");
    }
    
    public void write(final e e) throws IOException {
        Experiment.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Experiment>
    {
        private Boolean active;
        private String bucketing_key;
        private String bucketing_type;
        private String bucketing_value;
        private Long end_timestamp;
        private String github_link;
        private Long id;
        private String info;
        private Boolean is_override;
        private String name;
        private String owner;
        private String qa_proxy_event;
        private Long start_timestamp;
        private String variant;
        private List<String> variant_names;
        private List<Double> variant_percentages;
        private String version;
        
        public Builder() {
        }
        
        public Builder(final Experiment experiment) {
            this.id = experiment.id;
            this.name = experiment.name;
            this.owner = experiment.owner;
            this.variant = experiment.variant;
            this.start_timestamp = experiment.start_timestamp;
            this.end_timestamp = experiment.end_timestamp;
            this.bucketing_key = experiment.bucketing_key;
            this.version = experiment.version;
            this.bucketing_value = experiment.bucketing_value;
            this.is_override = experiment.is_override;
            this.variant_names = experiment.variant_names;
            this.variant_percentages = experiment.variant_percentages;
            this.active = experiment.active;
            this.github_link = experiment.github_link;
            this.info = experiment.info;
            this.qa_proxy_event = experiment.qa_proxy_event;
            this.bucketing_type = experiment.bucketing_type;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.is_override;
        }
        
        public static /* synthetic */ List access$1100(final Builder builder) {
            return builder.variant_names;
        }
        
        public static /* synthetic */ List access$1200(final Builder builder) {
            return builder.variant_percentages;
        }
        
        public static /* synthetic */ Boolean access$1300(final Builder builder) {
            return builder.active;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.github_link;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.info;
        }
        
        public static /* synthetic */ String access$1600(final Builder builder) {
            return builder.qa_proxy_event;
        }
        
        public static /* synthetic */ String access$1700(final Builder builder) {
            return builder.bucketing_type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.owner;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.variant;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.start_timestamp;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.end_timestamp;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.bucketing_key;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.version;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.bucketing_value;
        }
        
        public Builder active(final Boolean active) {
            this.active = active;
            return this;
        }
        
        public Builder bucketing_key(final String bucketing_key) {
            this.bucketing_key = bucketing_key;
            return this;
        }
        
        public Builder bucketing_type(final String bucketing_type) {
            this.bucketing_type = bucketing_type;
            return this;
        }
        
        public Builder bucketing_value(final String bucketing_value) {
            this.bucketing_value = bucketing_value;
            return this;
        }
        
        public Experiment build() {
            if (this.id != null) {
                return new Experiment(this, null);
            }
            throw new IllegalStateException("Required field 'id' is missing");
        }
        
        public Builder end_timestamp(final Long end_timestamp) {
            this.end_timestamp = end_timestamp;
            return this;
        }
        
        public Builder github_link(final String github_link) {
            this.github_link = github_link;
            return this;
        }
        
        public Builder id(final Long id) {
            if (id != null) {
                this.id = id;
                return this;
            }
            throw new NullPointerException("Required field 'id' cannot be null");
        }
        
        public Builder info(final String info) {
            this.info = info;
            return this;
        }
        
        public Builder is_override(final Boolean is_override) {
            this.is_override = is_override;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder owner(final String owner) {
            this.owner = owner;
            return this;
        }
        
        public Builder qa_proxy_event(final String qa_proxy_event) {
            this.qa_proxy_event = qa_proxy_event;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
            this.owner = null;
            this.variant = null;
            this.start_timestamp = null;
            this.end_timestamp = null;
            this.bucketing_key = null;
            this.version = null;
            this.bucketing_value = null;
            this.is_override = null;
            this.variant_names = null;
            this.variant_percentages = null;
            this.active = null;
            this.github_link = null;
            this.info = null;
            this.qa_proxy_event = null;
            this.bucketing_type = null;
        }
        
        public Builder start_timestamp(final Long start_timestamp) {
            this.start_timestamp = start_timestamp;
            return this;
        }
        
        public Builder variant(final String variant) {
            this.variant = variant;
            return this;
        }
        
        public Builder variant_names(final List<String> variant_names) {
            this.variant_names = variant_names;
            return this;
        }
        
        public Builder variant_percentages(final List<Double> variant_percentages) {
            this.variant_percentages = variant_percentages;
            return this;
        }
        
        public Builder version(final String version) {
            this.version = version;
            return this;
        }
    }
    
    public static final class ExperimentAdapter implements a<Experiment, Builder>
    {
        private ExperimentAdapter() {
        }
        
        public Experiment read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Experiment read(final e e, final Builder builder) throws IOException {
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
                    case 18: {
                        if (a == 11) {
                            builder.bucketing_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.qa_proxy_event(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.info(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.github_link(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 2) {
                            builder.active(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList<Double>(w.b);
                            while (i < w.b) {
                                list.add(e.h());
                                ++i;
                            }
                            e.x();
                            builder.variant_percentages((List<Double>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.variant_names((List<String>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.is_override(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.bucketing_value(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.version(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.bucketing_key(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.end_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.start_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.variant(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.owner(e.F());
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
                        if (a == 10) {
                            builder.id(e.v());
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
        
        public void write(final e e, final Experiment experiment) throws IOException {
            e.a0();
            e.N(1, (byte)10);
            a.r(experiment.id, e);
            if (experiment.name != null) {
                e.N(2, (byte)11);
                e.Z(experiment.name);
                e.O();
            }
            if (experiment.owner != null) {
                e.N(3, (byte)11);
                e.Z(experiment.owner);
                e.O();
            }
            if (experiment.variant != null) {
                e.N(4, (byte)11);
                e.Z(experiment.variant);
                e.O();
            }
            if (experiment.start_timestamp != null) {
                e.N(5, (byte)10);
                a.r(experiment.start_timestamp, e);
            }
            if (experiment.end_timestamp != null) {
                e.N(6, (byte)10);
                a.r(experiment.end_timestamp, e);
            }
            if (experiment.bucketing_key != null) {
                e.N(7, (byte)11);
                e.Z(experiment.bucketing_key);
                e.O();
            }
            if (experiment.version != null) {
                e.N(8, (byte)11);
                e.Z(experiment.version);
                e.O();
            }
            if (experiment.bucketing_value != null) {
                e.N(9, (byte)11);
                e.Z(experiment.bucketing_value);
                e.O();
            }
            if (experiment.is_override != null) {
                e.N(10, (byte)2);
                d.z(experiment.is_override, e);
            }
            if (experiment.variant_names != null) {
                e.N(11, (byte)15);
                e.V((byte)11, experiment.variant_names.size());
                final Iterator<String> iterator = experiment.variant_names.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (experiment.variant_percentages != null) {
                e.N(12, (byte)15);
                e.V((byte)4, experiment.variant_percentages.size());
                final Iterator<Double> iterator2 = experiment.variant_percentages.iterator();
                while (iterator2.hasNext()) {
                    e.L((double)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (experiment.active != null) {
                e.N(13, (byte)2);
                d.z(experiment.active, e);
            }
            if (experiment.github_link != null) {
                e.N(15, (byte)11);
                e.Z(experiment.github_link);
                e.O();
            }
            if (experiment.info != null) {
                e.N(16, (byte)11);
                e.Z(experiment.info);
                e.O();
            }
            if (experiment.qa_proxy_event != null) {
                e.N(17, (byte)11);
                e.Z(experiment.qa_proxy_event);
                e.O();
            }
            if (experiment.bucketing_type != null) {
                e.N(18, (byte)11);
                e.Z(experiment.bucketing_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
