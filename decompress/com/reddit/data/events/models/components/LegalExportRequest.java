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

public final class LegalExportRequest
{
    public static final a<LegalExportRequest, Builder> ADAPTER;
    public final String ads_data_status;
    public final String automation_type;
    public final Long completed_timestamp;
    public final Long due_timestamp;
    public final Long ended_timestamp;
    public final String gifts_data_status;
    public final Boolean has_ndo;
    public final Long id;
    public final Long received_timestamp;
    public final List<String> requested_information;
    public final String requestor_id;
    public final Long started_timestamp;
    public final String status;
    public final String target_id;
    public final String target_type;
    public final String type;
    public final List<String> user_ids;
    
    static {
        ADAPTER = (a)new LegalExportRequestAdapter(null);
    }
    
    private LegalExportRequest(final Builder builder) {
        final List access$100 = Builder.access$100(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.user_ids = unmodifiableList;
        this.type = Builder.access$200(builder);
        List<String> unmodifiableList2;
        if (Builder.access$300(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$300(builder));
        }
        this.requested_information = unmodifiableList2;
        this.status = Builder.access$400(builder);
        this.due_timestamp = Builder.access$500(builder);
        this.received_timestamp = Builder.access$600(builder);
        this.started_timestamp = Builder.access$700(builder);
        this.ended_timestamp = Builder.access$800(builder);
        this.ads_data_status = Builder.access$900(builder);
        this.gifts_data_status = Builder.access$1000(builder);
        this.has_ndo = Builder.access$1100(builder);
        this.automation_type = Builder.access$1200(builder);
        this.id = Builder.access$1300(builder);
        this.target_id = Builder.access$1400(builder);
        this.target_type = Builder.access$1500(builder);
        this.requestor_id = Builder.access$1600(builder);
        this.completed_timestamp = Builder.access$1700(builder);
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
        if (!(o instanceof LegalExportRequest)) {
            return false;
        }
        final LegalExportRequest legalExportRequest = (LegalExportRequest)o;
        final List<String> user_ids = this.user_ids;
        final List<String> user_ids2 = legalExportRequest.user_ids;
        if (user_ids == user_ids2 || (user_ids != null && user_ids.equals(user_ids2))) {
            final String type = this.type;
            final String type2 = legalExportRequest.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final List<String> requested_information = this.requested_information;
                final List<String> requested_information2 = legalExportRequest.requested_information;
                if (requested_information == requested_information2 || (requested_information != null && requested_information.equals(requested_information2))) {
                    final String status = this.status;
                    final String status2 = legalExportRequest.status;
                    if (status == status2 || (status != null && status.equals(status2))) {
                        final Long due_timestamp = this.due_timestamp;
                        final Long due_timestamp2 = legalExportRequest.due_timestamp;
                        if (due_timestamp == due_timestamp2 || (due_timestamp != null && due_timestamp.equals(due_timestamp2))) {
                            final Long received_timestamp = this.received_timestamp;
                            final Long received_timestamp2 = legalExportRequest.received_timestamp;
                            if (received_timestamp == received_timestamp2 || (received_timestamp != null && received_timestamp.equals(received_timestamp2))) {
                                final Long started_timestamp = this.started_timestamp;
                                final Long started_timestamp2 = legalExportRequest.started_timestamp;
                                if (started_timestamp == started_timestamp2 || (started_timestamp != null && started_timestamp.equals(started_timestamp2))) {
                                    final Long ended_timestamp = this.ended_timestamp;
                                    final Long ended_timestamp2 = legalExportRequest.ended_timestamp;
                                    if (ended_timestamp == ended_timestamp2 || (ended_timestamp != null && ended_timestamp.equals(ended_timestamp2))) {
                                        final String ads_data_status = this.ads_data_status;
                                        final String ads_data_status2 = legalExportRequest.ads_data_status;
                                        if (ads_data_status == ads_data_status2 || (ads_data_status != null && ads_data_status.equals(ads_data_status2))) {
                                            final String gifts_data_status = this.gifts_data_status;
                                            final String gifts_data_status2 = legalExportRequest.gifts_data_status;
                                            if (gifts_data_status == gifts_data_status2 || (gifts_data_status != null && gifts_data_status.equals(gifts_data_status2))) {
                                                final Boolean has_ndo = this.has_ndo;
                                                final Boolean has_ndo2 = legalExportRequest.has_ndo;
                                                if (has_ndo == has_ndo2 || (has_ndo != null && has_ndo.equals(has_ndo2))) {
                                                    final String automation_type = this.automation_type;
                                                    final String automation_type2 = legalExportRequest.automation_type;
                                                    if (automation_type == automation_type2 || (automation_type != null && automation_type.equals(automation_type2))) {
                                                        final Long id = this.id;
                                                        final Long id2 = legalExportRequest.id;
                                                        if (id == id2 || (id != null && id.equals(id2))) {
                                                            final String target_id = this.target_id;
                                                            final String target_id2 = legalExportRequest.target_id;
                                                            if (target_id == target_id2 || (target_id != null && target_id.equals(target_id2))) {
                                                                final String target_type = this.target_type;
                                                                final String target_type2 = legalExportRequest.target_type;
                                                                if (target_type == target_type2 || (target_type != null && target_type.equals(target_type2))) {
                                                                    final String requestor_id = this.requestor_id;
                                                                    final String requestor_id2 = legalExportRequest.requestor_id;
                                                                    if (requestor_id == requestor_id2 || (requestor_id != null && requestor_id.equals(requestor_id2))) {
                                                                        final Long completed_timestamp = this.completed_timestamp;
                                                                        final Long completed_timestamp2 = legalExportRequest.completed_timestamp;
                                                                        boolean b2 = b;
                                                                        if (completed_timestamp == completed_timestamp2) {
                                                                            return b2;
                                                                        }
                                                                        if (completed_timestamp != null && completed_timestamp.equals(completed_timestamp2)) {
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
        final List<String> user_ids = this.user_ids;
        int hashCode = 0;
        int hashCode2;
        if (user_ids == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = user_ids.hashCode();
        }
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final List<String> requested_information = this.requested_information;
        int hashCode4;
        if (requested_information == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = requested_information.hashCode();
        }
        final String status = this.status;
        int hashCode5;
        if (status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = status.hashCode();
        }
        final Long due_timestamp = this.due_timestamp;
        int hashCode6;
        if (due_timestamp == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = due_timestamp.hashCode();
        }
        final Long received_timestamp = this.received_timestamp;
        int hashCode7;
        if (received_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = received_timestamp.hashCode();
        }
        final Long started_timestamp = this.started_timestamp;
        int hashCode8;
        if (started_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = started_timestamp.hashCode();
        }
        final Long ended_timestamp = this.ended_timestamp;
        int hashCode9;
        if (ended_timestamp == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = ended_timestamp.hashCode();
        }
        final String ads_data_status = this.ads_data_status;
        int hashCode10;
        if (ads_data_status == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = ads_data_status.hashCode();
        }
        final String gifts_data_status = this.gifts_data_status;
        int hashCode11;
        if (gifts_data_status == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = gifts_data_status.hashCode();
        }
        final Boolean has_ndo = this.has_ndo;
        int hashCode12;
        if (has_ndo == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = has_ndo.hashCode();
        }
        final String automation_type = this.automation_type;
        int hashCode13;
        if (automation_type == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = automation_type.hashCode();
        }
        final Long id = this.id;
        int hashCode14;
        if (id == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = id.hashCode();
        }
        final String target_id = this.target_id;
        int hashCode15;
        if (target_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = target_id.hashCode();
        }
        final String target_type = this.target_type;
        int hashCode16;
        if (target_type == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = target_type.hashCode();
        }
        final String requestor_id = this.requestor_id;
        int hashCode17;
        if (requestor_id == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = requestor_id.hashCode();
        }
        final Long completed_timestamp = this.completed_timestamp;
        if (completed_timestamp != null) {
            hashCode = completed_timestamp.hashCode();
        }
        return (((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LegalExportRequest{user_ids=");
        k.append(this.user_ids);
        k.append(", type=");
        k.append(this.type);
        k.append(", requested_information=");
        k.append(this.requested_information);
        k.append(", status=");
        k.append(this.status);
        k.append(", due_timestamp=");
        k.append(this.due_timestamp);
        k.append(", received_timestamp=");
        k.append(this.received_timestamp);
        k.append(", started_timestamp=");
        k.append(this.started_timestamp);
        k.append(", ended_timestamp=");
        k.append(this.ended_timestamp);
        k.append(", ads_data_status=");
        k.append(this.ads_data_status);
        k.append(", gifts_data_status=");
        k.append(this.gifts_data_status);
        k.append(", has_ndo=");
        k.append(this.has_ndo);
        k.append(", automation_type=");
        k.append(this.automation_type);
        k.append(", id=");
        k.append(this.id);
        k.append(", target_id=");
        k.append(this.target_id);
        k.append(", target_type=");
        k.append(this.target_type);
        k.append(", requestor_id=");
        k.append(this.requestor_id);
        k.append(", completed_timestamp=");
        return a.h(k, this.completed_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        LegalExportRequest.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<LegalExportRequest>
    {
        private String ads_data_status;
        private String automation_type;
        private Long completed_timestamp;
        private Long due_timestamp;
        private Long ended_timestamp;
        private String gifts_data_status;
        private Boolean has_ndo;
        private Long id;
        private Long received_timestamp;
        private List<String> requested_information;
        private String requestor_id;
        private Long started_timestamp;
        private String status;
        private String target_id;
        private String target_type;
        private String type;
        private List<String> user_ids;
        
        public Builder() {
        }
        
        public Builder(final LegalExportRequest legalExportRequest) {
            this.user_ids = legalExportRequest.user_ids;
            this.type = legalExportRequest.type;
            this.requested_information = legalExportRequest.requested_information;
            this.status = legalExportRequest.status;
            this.due_timestamp = legalExportRequest.due_timestamp;
            this.received_timestamp = legalExportRequest.received_timestamp;
            this.started_timestamp = legalExportRequest.started_timestamp;
            this.ended_timestamp = legalExportRequest.ended_timestamp;
            this.ads_data_status = legalExportRequest.ads_data_status;
            this.gifts_data_status = legalExportRequest.gifts_data_status;
            this.has_ndo = legalExportRequest.has_ndo;
            this.automation_type = legalExportRequest.automation_type;
            this.id = legalExportRequest.id;
            this.target_id = legalExportRequest.target_id;
            this.target_type = legalExportRequest.target_type;
            this.requestor_id = legalExportRequest.requestor_id;
            this.completed_timestamp = legalExportRequest.completed_timestamp;
        }
        
        public static /* synthetic */ List access$100(final Builder builder) {
            return builder.user_ids;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.gifts_data_status;
        }
        
        public static /* synthetic */ Boolean access$1100(final Builder builder) {
            return builder.has_ndo;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.automation_type;
        }
        
        public static /* synthetic */ Long access$1300(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.target_id;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.target_type;
        }
        
        public static /* synthetic */ String access$1600(final Builder builder) {
            return builder.requestor_id;
        }
        
        public static /* synthetic */ Long access$1700(final Builder builder) {
            return builder.completed_timestamp;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ List access$300(final Builder builder) {
            return builder.requested_information;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.status;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.due_timestamp;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.received_timestamp;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.started_timestamp;
        }
        
        public static /* synthetic */ Long access$800(final Builder builder) {
            return builder.ended_timestamp;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.ads_data_status;
        }
        
        public Builder ads_data_status(final String ads_data_status) {
            this.ads_data_status = ads_data_status;
            return this;
        }
        
        public Builder automation_type(final String automation_type) {
            this.automation_type = automation_type;
            return this;
        }
        
        public LegalExportRequest build() {
            return new LegalExportRequest(this, null);
        }
        
        public Builder completed_timestamp(final Long completed_timestamp) {
            this.completed_timestamp = completed_timestamp;
            return this;
        }
        
        public Builder due_timestamp(final Long due_timestamp) {
            this.due_timestamp = due_timestamp;
            return this;
        }
        
        public Builder ended_timestamp(final Long ended_timestamp) {
            this.ended_timestamp = ended_timestamp;
            return this;
        }
        
        public Builder gifts_data_status(final String gifts_data_status) {
            this.gifts_data_status = gifts_data_status;
            return this;
        }
        
        public Builder has_ndo(final Boolean has_ndo) {
            this.has_ndo = has_ndo;
            return this;
        }
        
        public Builder id(final Long id) {
            this.id = id;
            return this;
        }
        
        public Builder received_timestamp(final Long received_timestamp) {
            this.received_timestamp = received_timestamp;
            return this;
        }
        
        public Builder requested_information(final List<String> requested_information) {
            this.requested_information = requested_information;
            return this;
        }
        
        public Builder requestor_id(final String requestor_id) {
            this.requestor_id = requestor_id;
            return this;
        }
        
        public void reset() {
            this.user_ids = null;
            this.type = null;
            this.requested_information = null;
            this.status = null;
            this.due_timestamp = null;
            this.received_timestamp = null;
            this.started_timestamp = null;
            this.ended_timestamp = null;
            this.ads_data_status = null;
            this.gifts_data_status = null;
            this.has_ndo = null;
            this.automation_type = null;
            this.id = null;
            this.target_id = null;
            this.target_type = null;
            this.requestor_id = null;
            this.completed_timestamp = null;
        }
        
        public Builder started_timestamp(final Long started_timestamp) {
            this.started_timestamp = started_timestamp;
            return this;
        }
        
        public Builder status(final String status) {
            this.status = status;
            return this;
        }
        
        public Builder target_id(final String target_id) {
            this.target_id = target_id;
            return this;
        }
        
        public Builder target_type(final String target_type) {
            this.target_type = target_type;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder user_ids(final List<String> user_ids) {
            this.user_ids = user_ids;
            return this;
        }
    }
    
    public static final class LegalExportRequestAdapter implements a<LegalExportRequest, Builder>
    {
        private LegalExportRequestAdapter() {
        }
        
        public LegalExportRequest read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public LegalExportRequest read(final e e, final Builder builder) throws IOException {
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
                    case 17: {
                        if (a == 10) {
                            builder.completed_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.requestor_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.target_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.target_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 10) {
                            builder.id(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.automation_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.has_ndo(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.gifts_data_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.ads_data_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.ended_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.started_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.received_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.due_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.requested_information((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.user_ids((List<String>)list2);
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
        
        public void write(final e e, final LegalExportRequest legalExportRequest) throws IOException {
            e.a0();
            if (legalExportRequest.user_ids != null) {
                e.N(1, (byte)15);
                e.V((byte)11, legalExportRequest.user_ids.size());
                final Iterator<String> iterator = legalExportRequest.user_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (legalExportRequest.type != null) {
                e.N(2, (byte)11);
                e.Z(legalExportRequest.type);
                e.O();
            }
            if (legalExportRequest.requested_information != null) {
                e.N(3, (byte)15);
                e.V((byte)11, legalExportRequest.requested_information.size());
                final Iterator<String> iterator2 = legalExportRequest.requested_information.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (legalExportRequest.status != null) {
                e.N(4, (byte)11);
                e.Z(legalExportRequest.status);
                e.O();
            }
            if (legalExportRequest.due_timestamp != null) {
                e.N(5, (byte)10);
                a.r(legalExportRequest.due_timestamp, e);
            }
            if (legalExportRequest.received_timestamp != null) {
                e.N(6, (byte)10);
                a.r(legalExportRequest.received_timestamp, e);
            }
            if (legalExportRequest.started_timestamp != null) {
                e.N(7, (byte)10);
                a.r(legalExportRequest.started_timestamp, e);
            }
            if (legalExportRequest.ended_timestamp != null) {
                e.N(8, (byte)10);
                a.r(legalExportRequest.ended_timestamp, e);
            }
            if (legalExportRequest.ads_data_status != null) {
                e.N(9, (byte)11);
                e.Z(legalExportRequest.ads_data_status);
                e.O();
            }
            if (legalExportRequest.gifts_data_status != null) {
                e.N(10, (byte)11);
                e.Z(legalExportRequest.gifts_data_status);
                e.O();
            }
            if (legalExportRequest.has_ndo != null) {
                e.N(11, (byte)2);
                d.z(legalExportRequest.has_ndo, e);
            }
            if (legalExportRequest.automation_type != null) {
                e.N(12, (byte)11);
                e.Z(legalExportRequest.automation_type);
                e.O();
            }
            if (legalExportRequest.id != null) {
                e.N(13, (byte)10);
                a.r(legalExportRequest.id, e);
            }
            if (legalExportRequest.target_id != null) {
                e.N(14, (byte)11);
                e.Z(legalExportRequest.target_id);
                e.O();
            }
            if (legalExportRequest.target_type != null) {
                e.N(15, (byte)11);
                e.Z(legalExportRequest.target_type);
                e.O();
            }
            if (legalExportRequest.requestor_id != null) {
                e.N(16, (byte)11);
                e.Z(legalExportRequest.requestor_id);
                e.O();
            }
            if (legalExportRequest.completed_timestamp != null) {
                e.N(17, (byte)10);
                a.r(legalExportRequest.completed_timestamp, e);
            }
            e.P();
            e.b0();
        }
    }
}
