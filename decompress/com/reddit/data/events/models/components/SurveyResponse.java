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

public final class SurveyResponse
{
    public static final a<SurveyResponse, Builder> ADAPTER;
    public final List<String> choices;
    public final List<String> choices_by_index;
    
    static {
        ADAPTER = (a)new SurveyResponseAdapter(null);
    }
    
    private SurveyResponse(final Builder builder) {
        final List access$100 = Builder.access$100(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.choices_by_index = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$200(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.choices = unmodifiableList2;
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
        if (!(o instanceof SurveyResponse)) {
            return false;
        }
        final SurveyResponse surveyResponse = (SurveyResponse)o;
        final List<String> choices_by_index = this.choices_by_index;
        final List<String> choices_by_index2 = surveyResponse.choices_by_index;
        if (choices_by_index == choices_by_index2 || (choices_by_index != null && choices_by_index.equals(choices_by_index2))) {
            final List<String> choices = this.choices;
            final List<String> choices2 = surveyResponse.choices;
            boolean b2 = b;
            if (choices == choices2) {
                return b2;
            }
            if (choices != null && choices.equals(choices2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> choices_by_index = this.choices_by_index;
        int hashCode = 0;
        int hashCode2;
        if (choices_by_index == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = choices_by_index.hashCode();
        }
        final List<String> choices = this.choices;
        if (choices != null) {
            hashCode = choices.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SurveyResponse{choices_by_index=");
        k.append(this.choices_by_index);
        k.append(", choices=");
        return n.r(k, (List)this.choices, "}");
    }
    
    public void write(final e e) throws IOException {
        SurveyResponse.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<SurveyResponse>
    {
        private List<String> choices;
        private List<String> choices_by_index;
        
        public Builder() {
        }
        
        public Builder(final SurveyResponse surveyResponse) {
            this.choices_by_index = surveyResponse.choices_by_index;
            this.choices = surveyResponse.choices;
        }
        
        public static /* synthetic */ List access$100(final Builder builder) {
            return builder.choices_by_index;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.choices;
        }
        
        public SurveyResponse build() {
            return new SurveyResponse(this, null);
        }
        
        public Builder choices(final List<String> choices) {
            this.choices = choices;
            return this;
        }
        
        public Builder choices_by_index(final List<String> choices_by_index) {
            this.choices_by_index = choices_by_index;
            return this;
        }
        
        public void reset() {
            this.choices_by_index = null;
            this.choices = null;
        }
    }
    
    public static final class SurveyResponseAdapter implements a<SurveyResponse, Builder>
    {
        private SurveyResponseAdapter() {
        }
        
        public SurveyResponse read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public SurveyResponse read(final e e, final Builder builder) throws IOException {
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
                if (b != 1) {
                    if (b != 2) {
                        mt.a.a(e, a);
                    }
                    else if (a == 15) {
                        c w;
                        ArrayList list;
                        for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                        e.x();
                        builder.choices((List<String>)list);
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 15) {
                    final c w2 = e.w();
                    final ArrayList list2 = new ArrayList(w2.b);
                    for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                    e.x();
                    builder.choices_by_index((List<String>)list2);
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final SurveyResponse surveyResponse) throws IOException {
            e.a0();
            if (surveyResponse.choices_by_index != null) {
                e.N(1, (byte)15);
                e.V((byte)11, surveyResponse.choices_by_index.size());
                final Iterator<String> iterator = surveyResponse.choices_by_index.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (surveyResponse.choices != null) {
                e.N(2, (byte)15);
                e.V((byte)11, surveyResponse.choices.size());
                final Iterator<String> iterator2 = surveyResponse.choices.iterator();
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
