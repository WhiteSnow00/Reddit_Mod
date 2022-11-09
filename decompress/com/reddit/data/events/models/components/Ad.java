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

public final class Ad
{
    public static final a<Ad, Builder> ADAPTER;
    public final String admin_approval;
    public final List<String> classifications;
    public final List<String> click_trackers;
    public final String click_url;
    public final String configured_status;
    public final String effective_status;
    public final String id;
    public final String name;
    public final String post_type;
    public final Long preview_expiry_timestamp;
    public final String rejection_reason;
    public final List<String> third_party_trackers;
    
    static {
        ADAPTER = (a)new AdAdapter(null);
    }
    
    private Ad(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
        this.click_url = Builder.access$300(builder);
        final List access$400 = Builder.access$400(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$400 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$400(builder));
        }
        this.third_party_trackers = unmodifiableList;
        this.configured_status = Builder.access$500(builder);
        this.effective_status = Builder.access$600(builder);
        this.admin_approval = Builder.access$700(builder);
        List<String> unmodifiableList2;
        if (Builder.access$800(builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$800(builder));
        }
        this.click_trackers = unmodifiableList2;
        List<String> unmodifiableList3;
        if (Builder.access$900(builder) == null) {
            unmodifiableList3 = list;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Builder.access$900(builder));
        }
        this.classifications = unmodifiableList3;
        this.rejection_reason = Builder.access$1000(builder);
        this.preview_expiry_timestamp = Builder.access$1100(builder);
        this.post_type = Builder.access$1200(builder);
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
        if (!(o instanceof Ad)) {
            return false;
        }
        final Ad ad = (Ad)o;
        final String id = this.id;
        final String id2 = ad.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = ad.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String click_url = this.click_url;
                final String click_url2 = ad.click_url;
                if (click_url == click_url2 || (click_url != null && click_url.equals(click_url2))) {
                    final List<String> third_party_trackers = this.third_party_trackers;
                    final List<String> third_party_trackers2 = ad.third_party_trackers;
                    if (third_party_trackers == third_party_trackers2 || (third_party_trackers != null && third_party_trackers.equals(third_party_trackers2))) {
                        final String configured_status = this.configured_status;
                        final String configured_status2 = ad.configured_status;
                        if (configured_status == configured_status2 || (configured_status != null && configured_status.equals(configured_status2))) {
                            final String effective_status = this.effective_status;
                            final String effective_status2 = ad.effective_status;
                            if (effective_status == effective_status2 || (effective_status != null && effective_status.equals(effective_status2))) {
                                final String admin_approval = this.admin_approval;
                                final String admin_approval2 = ad.admin_approval;
                                if (admin_approval == admin_approval2 || (admin_approval != null && admin_approval.equals(admin_approval2))) {
                                    final List<String> click_trackers = this.click_trackers;
                                    final List<String> click_trackers2 = ad.click_trackers;
                                    if (click_trackers == click_trackers2 || (click_trackers != null && click_trackers.equals(click_trackers2))) {
                                        final List<String> classifications = this.classifications;
                                        final List<String> classifications2 = ad.classifications;
                                        if (classifications == classifications2 || (classifications != null && classifications.equals(classifications2))) {
                                            final String rejection_reason = this.rejection_reason;
                                            final String rejection_reason2 = ad.rejection_reason;
                                            if (rejection_reason == rejection_reason2 || (rejection_reason != null && rejection_reason.equals(rejection_reason2))) {
                                                final Long preview_expiry_timestamp = this.preview_expiry_timestamp;
                                                final Long preview_expiry_timestamp2 = ad.preview_expiry_timestamp;
                                                if (preview_expiry_timestamp == preview_expiry_timestamp2 || (preview_expiry_timestamp != null && preview_expiry_timestamp.equals(preview_expiry_timestamp2))) {
                                                    final String post_type = this.post_type;
                                                    final String post_type2 = ad.post_type;
                                                    boolean b2 = b;
                                                    if (post_type == post_type2) {
                                                        return b2;
                                                    }
                                                    if (post_type != null && post_type.equals(post_type2)) {
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
        final String click_url = this.click_url;
        int hashCode4;
        if (click_url == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = click_url.hashCode();
        }
        final List<String> third_party_trackers = this.third_party_trackers;
        int hashCode5;
        if (third_party_trackers == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = third_party_trackers.hashCode();
        }
        final String configured_status = this.configured_status;
        int hashCode6;
        if (configured_status == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = configured_status.hashCode();
        }
        final String effective_status = this.effective_status;
        int hashCode7;
        if (effective_status == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = effective_status.hashCode();
        }
        final String admin_approval = this.admin_approval;
        int hashCode8;
        if (admin_approval == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = admin_approval.hashCode();
        }
        final List<String> click_trackers = this.click_trackers;
        int hashCode9;
        if (click_trackers == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = click_trackers.hashCode();
        }
        final List<String> classifications = this.classifications;
        int hashCode10;
        if (classifications == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = classifications.hashCode();
        }
        final String rejection_reason = this.rejection_reason;
        int hashCode11;
        if (rejection_reason == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = rejection_reason.hashCode();
        }
        final Long preview_expiry_timestamp = this.preview_expiry_timestamp;
        int hashCode12;
        if (preview_expiry_timestamp == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = preview_expiry_timestamp.hashCode();
        }
        final String post_type = this.post_type;
        if (post_type != null) {
            hashCode = post_type.hashCode();
        }
        return ((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Ad{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", click_url=");
        k.append(this.click_url);
        k.append(", third_party_trackers=");
        k.append(this.third_party_trackers);
        k.append(", configured_status=");
        k.append(this.configured_status);
        k.append(", effective_status=");
        k.append(this.effective_status);
        k.append(", admin_approval=");
        k.append(this.admin_approval);
        k.append(", click_trackers=");
        k.append(this.click_trackers);
        k.append(", classifications=");
        k.append(this.classifications);
        k.append(", rejection_reason=");
        k.append(this.rejection_reason);
        k.append(", preview_expiry_timestamp=");
        k.append(this.preview_expiry_timestamp);
        k.append(", post_type=");
        return b.j(k, this.post_type, "}");
    }
    
    public void write(final e e) throws IOException {
        Ad.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AdAdapter implements a<Ad, Builder>
    {
        private AdAdapter() {
        }
        
        public Ad read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Ad read(final e e, final Builder builder) throws IOException {
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
                    case 12: {
                        if (a == 11) {
                            builder.post_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 10) {
                            builder.preview_expiry_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.rejection_reason(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.classifications((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.click_trackers((List<String>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.admin_approval(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.effective_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.configured_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 15) {
                            final c w3 = e.w();
                            final ArrayList list3 = new ArrayList(w3.b);
                            for (int k = n2; k < w3.b; k = d.h(e, list3, k, 1)) {}
                            e.x();
                            builder.third_party_trackers((List<String>)list3);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.click_url(e.F());
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
        
        public void write(final e e, final Ad ad) throws IOException {
            e.a0();
            if (ad.id != null) {
                e.N(1, (byte)11);
                e.Z(ad.id);
                e.O();
            }
            if (ad.name != null) {
                e.N(2, (byte)11);
                e.Z(ad.name);
                e.O();
            }
            if (ad.click_url != null) {
                e.N(3, (byte)11);
                e.Z(ad.click_url);
                e.O();
            }
            if (ad.third_party_trackers != null) {
                e.N(4, (byte)15);
                e.V((byte)11, ad.third_party_trackers.size());
                final Iterator<String> iterator = ad.third_party_trackers.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (ad.configured_status != null) {
                e.N(5, (byte)11);
                e.Z(ad.configured_status);
                e.O();
            }
            if (ad.effective_status != null) {
                e.N(6, (byte)11);
                e.Z(ad.effective_status);
                e.O();
            }
            if (ad.admin_approval != null) {
                e.N(7, (byte)11);
                e.Z(ad.admin_approval);
                e.O();
            }
            if (ad.click_trackers != null) {
                e.N(8, (byte)15);
                e.V((byte)11, ad.click_trackers.size());
                final Iterator<String> iterator2 = ad.click_trackers.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (ad.classifications != null) {
                e.N(9, (byte)15);
                e.V((byte)11, ad.classifications.size());
                final Iterator<String> iterator3 = ad.classifications.iterator();
                while (iterator3.hasNext()) {
                    e.Z((String)iterator3.next());
                }
                e.X();
                e.O();
            }
            if (ad.rejection_reason != null) {
                e.N(10, (byte)11);
                e.Z(ad.rejection_reason);
                e.O();
            }
            if (ad.preview_expiry_timestamp != null) {
                e.N(11, (byte)10);
                a.r(ad.preview_expiry_timestamp, e);
            }
            if (ad.post_type != null) {
                e.N(12, (byte)11);
                e.Z(ad.post_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<Ad>
    {
        private String admin_approval;
        private List<String> classifications;
        private List<String> click_trackers;
        private String click_url;
        private String configured_status;
        private String effective_status;
        private String id;
        private String name;
        private String post_type;
        private Long preview_expiry_timestamp;
        private String rejection_reason;
        private List<String> third_party_trackers;
        
        public Builder() {
        }
        
        public Builder(final Ad ad) {
            this.id = ad.id;
            this.name = ad.name;
            this.click_url = ad.click_url;
            this.third_party_trackers = ad.third_party_trackers;
            this.configured_status = ad.configured_status;
            this.effective_status = ad.effective_status;
            this.admin_approval = ad.admin_approval;
            this.click_trackers = ad.click_trackers;
            this.classifications = ad.classifications;
            this.rejection_reason = ad.rejection_reason;
            this.preview_expiry_timestamp = ad.preview_expiry_timestamp;
            this.post_type = ad.post_type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.rejection_reason;
        }
        
        public static /* synthetic */ Long access$1100(final Builder builder) {
            return builder.preview_expiry_timestamp;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.post_type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.click_url;
        }
        
        public static /* synthetic */ List access$400(final Builder builder) {
            return builder.third_party_trackers;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.configured_status;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.effective_status;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.admin_approval;
        }
        
        public static /* synthetic */ List access$800(final Builder builder) {
            return builder.click_trackers;
        }
        
        public static /* synthetic */ List access$900(final Builder builder) {
            return builder.classifications;
        }
        
        public Builder admin_approval(final String admin_approval) {
            this.admin_approval = admin_approval;
            return this;
        }
        
        public Ad build() {
            return new Ad(this, null);
        }
        
        public Builder classifications(final List<String> classifications) {
            this.classifications = classifications;
            return this;
        }
        
        public Builder click_trackers(final List<String> click_trackers) {
            this.click_trackers = click_trackers;
            return this;
        }
        
        public Builder click_url(final String click_url) {
            this.click_url = click_url;
            return this;
        }
        
        public Builder configured_status(final String configured_status) {
            this.configured_status = configured_status;
            return this;
        }
        
        public Builder effective_status(final String effective_status) {
            this.effective_status = effective_status;
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
        
        public Builder post_type(final String post_type) {
            this.post_type = post_type;
            return this;
        }
        
        public Builder preview_expiry_timestamp(final Long preview_expiry_timestamp) {
            this.preview_expiry_timestamp = preview_expiry_timestamp;
            return this;
        }
        
        public Builder rejection_reason(final String rejection_reason) {
            this.rejection_reason = rejection_reason;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
            this.click_url = null;
            this.third_party_trackers = null;
            this.configured_status = null;
            this.effective_status = null;
            this.admin_approval = null;
            this.click_trackers = null;
            this.classifications = null;
            this.rejection_reason = null;
            this.preview_expiry_timestamp = null;
            this.post_type = null;
        }
        
        public Builder third_party_trackers(final List<String> third_party_trackers) {
            this.third_party_trackers = third_party_trackers;
            return this;
        }
    }
}
