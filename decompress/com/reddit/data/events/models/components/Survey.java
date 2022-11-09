// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Survey
{
    public static final a<Survey, Builder> ADAPTER;
    public final String experiment_name;
    public final String experiment_variant;
    public final String experiment_version;
    public final Integer max;
    public final Integer min;
    public final String parent_question_id;
    public final String question;
    public final String question_id;
    public final Integer score;
    public final String text;
    public final String type;
    
    static {
        ADAPTER = (a)new SurveyAdapter(null);
    }
    
    private Survey(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.min = Builder.access$200(builder);
        this.max = Builder.access$300(builder);
        this.score = Builder.access$400(builder);
        this.text = Builder.access$500(builder);
        this.experiment_name = Builder.access$600(builder);
        this.experiment_variant = Builder.access$700(builder);
        this.experiment_version = Builder.access$800(builder);
        this.question = Builder.access$900(builder);
        this.question_id = Builder.access$1000(builder);
        this.parent_question_id = Builder.access$1100(builder);
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
        if (!(o instanceof Survey)) {
            return false;
        }
        final Survey survey = (Survey)o;
        final String type = this.type;
        final String type2 = survey.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Integer min = this.min;
            final Integer min2 = survey.min;
            if (min == min2 || (min != null && min.equals(min2))) {
                final Integer max = this.max;
                final Integer max2 = survey.max;
                if (max == max2 || (max != null && max.equals(max2))) {
                    final Integer score = this.score;
                    final Integer score2 = survey.score;
                    if (score == score2 || (score != null && score.equals(score2))) {
                        final String text = this.text;
                        final String text2 = survey.text;
                        if (text == text2 || (text != null && text.equals(text2))) {
                            final String experiment_name = this.experiment_name;
                            final String experiment_name2 = survey.experiment_name;
                            if (experiment_name == experiment_name2 || (experiment_name != null && experiment_name.equals(experiment_name2))) {
                                final String experiment_variant = this.experiment_variant;
                                final String experiment_variant2 = survey.experiment_variant;
                                if (experiment_variant == experiment_variant2 || (experiment_variant != null && experiment_variant.equals(experiment_variant2))) {
                                    final String experiment_version = this.experiment_version;
                                    final String experiment_version2 = survey.experiment_version;
                                    if (experiment_version == experiment_version2 || (experiment_version != null && experiment_version.equals(experiment_version2))) {
                                        final String question = this.question;
                                        final String question2 = survey.question;
                                        if (question == question2 || (question != null && question.equals(question2))) {
                                            final String question_id = this.question_id;
                                            final String question_id2 = survey.question_id;
                                            if (question_id == question_id2 || (question_id != null && question_id.equals(question_id2))) {
                                                final String parent_question_id = this.parent_question_id;
                                                final String parent_question_id2 = survey.parent_question_id;
                                                boolean b2 = b;
                                                if (parent_question_id == parent_question_id2) {
                                                    return b2;
                                                }
                                                if (parent_question_id != null && parent_question_id.equals(parent_question_id2)) {
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
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Integer min = this.min;
        int hashCode3;
        if (min == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = min.hashCode();
        }
        final Integer max = this.max;
        int hashCode4;
        if (max == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = max.hashCode();
        }
        final Integer score = this.score;
        int hashCode5;
        if (score == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = score.hashCode();
        }
        final String text = this.text;
        int hashCode6;
        if (text == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = text.hashCode();
        }
        final String experiment_name = this.experiment_name;
        int hashCode7;
        if (experiment_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = experiment_name.hashCode();
        }
        final String experiment_variant = this.experiment_variant;
        int hashCode8;
        if (experiment_variant == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = experiment_variant.hashCode();
        }
        final String experiment_version = this.experiment_version;
        int hashCode9;
        if (experiment_version == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = experiment_version.hashCode();
        }
        final String question = this.question;
        int hashCode10;
        if (question == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = question.hashCode();
        }
        final String question_id = this.question_id;
        int hashCode11;
        if (question_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = question_id.hashCode();
        }
        final String parent_question_id = this.parent_question_id;
        if (parent_question_id != null) {
            hashCode = parent_question_id.hashCode();
        }
        return (((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Survey{type=");
        k.append(this.type);
        k.append(", min=");
        k.append(this.min);
        k.append(", max=");
        k.append(this.max);
        k.append(", score=");
        k.append(this.score);
        k.append(", text=");
        k.append(this.text);
        k.append(", experiment_name=");
        k.append(this.experiment_name);
        k.append(", experiment_variant=");
        k.append(this.experiment_variant);
        k.append(", experiment_version=");
        k.append(this.experiment_version);
        k.append(", question=");
        k.append(this.question);
        k.append(", question_id=");
        k.append(this.question_id);
        k.append(", parent_question_id=");
        return b.j(k, this.parent_question_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Survey.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Survey>
    {
        private String experiment_name;
        private String experiment_variant;
        private String experiment_version;
        private Integer max;
        private Integer min;
        private String parent_question_id;
        private String question;
        private String question_id;
        private Integer score;
        private String text;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Survey survey) {
            this.type = survey.type;
            this.min = survey.min;
            this.max = survey.max;
            this.score = survey.score;
            this.text = survey.text;
            this.experiment_name = survey.experiment_name;
            this.experiment_variant = survey.experiment_variant;
            this.experiment_version = survey.experiment_version;
            this.question = survey.question;
            this.question_id = survey.question_id;
            this.parent_question_id = survey.parent_question_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.question_id;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.parent_question_id;
        }
        
        public static /* synthetic */ Integer access$200(final Builder builder) {
            return builder.min;
        }
        
        public static /* synthetic */ Integer access$300(final Builder builder) {
            return builder.max;
        }
        
        public static /* synthetic */ Integer access$400(final Builder builder) {
            return builder.score;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.text;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.experiment_name;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.experiment_variant;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.experiment_version;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.question;
        }
        
        public Survey build() {
            return new Survey(this, null);
        }
        
        public Builder experiment_name(final String experiment_name) {
            this.experiment_name = experiment_name;
            return this;
        }
        
        public Builder experiment_variant(final String experiment_variant) {
            this.experiment_variant = experiment_variant;
            return this;
        }
        
        public Builder experiment_version(final String experiment_version) {
            this.experiment_version = experiment_version;
            return this;
        }
        
        public Builder max(final Integer max) {
            this.max = max;
            return this;
        }
        
        public Builder min(final Integer min) {
            this.min = min;
            return this;
        }
        
        public Builder parent_question_id(final String parent_question_id) {
            this.parent_question_id = parent_question_id;
            return this;
        }
        
        public Builder question(final String question) {
            this.question = question;
            return this;
        }
        
        public Builder question_id(final String question_id) {
            this.question_id = question_id;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.min = null;
            this.max = null;
            this.score = null;
            this.text = null;
            this.experiment_name = null;
            this.experiment_variant = null;
            this.experiment_version = null;
            this.question = null;
            this.question_id = null;
            this.parent_question_id = null;
        }
        
        public Builder score(final Integer score) {
            this.score = score;
            return this;
        }
        
        public Builder text(final String text) {
            this.text = text;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class SurveyAdapter implements a<Survey, Builder>
    {
        private SurveyAdapter() {
        }
        
        public Survey read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Survey read(final e e, final Builder builder) throws IOException {
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
                    case 11: {
                        if (a == 11) {
                            builder.parent_question_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.question_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.question(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.experiment_version(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.experiment_variant(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.experiment_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.text(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.score(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 8) {
                            builder.max(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 8) {
                            builder.min(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
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
        
        public void write(final e e, final Survey survey) throws IOException {
            e.a0();
            if (survey.type != null) {
                e.N(1, (byte)11);
                e.Z(survey.type);
                e.O();
            }
            if (survey.min != null) {
                e.N(2, (byte)8);
                b.r(survey.min, e);
            }
            if (survey.max != null) {
                e.N(3, (byte)8);
                b.r(survey.max, e);
            }
            if (survey.score != null) {
                e.N(4, (byte)8);
                b.r(survey.score, e);
            }
            if (survey.text != null) {
                e.N(5, (byte)11);
                e.Z(survey.text);
                e.O();
            }
            if (survey.experiment_name != null) {
                e.N(6, (byte)11);
                e.Z(survey.experiment_name);
                e.O();
            }
            if (survey.experiment_variant != null) {
                e.N(7, (byte)11);
                e.Z(survey.experiment_variant);
                e.O();
            }
            if (survey.experiment_version != null) {
                e.N(8, (byte)11);
                e.Z(survey.experiment_version);
                e.O();
            }
            if (survey.question != null) {
                e.N(9, (byte)11);
                e.Z(survey.question);
                e.O();
            }
            if (survey.question_id != null) {
                e.N(10, (byte)11);
                e.Z(survey.question_id);
                e.O();
            }
            if (survey.parent_question_id != null) {
                e.N(11, (byte)11);
                e.Z(survey.parent_question_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
