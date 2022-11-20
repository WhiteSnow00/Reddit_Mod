// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class RaterTag
{
    public static final a<RaterTag, Builder> ADAPTER;
    public final String module_type;
    public final List<String> non_selected_answer_ids;
    public final List<String> non_selected_answers;
    public final String rating_type;
    public final List<String> selected_answer_ids;
    public final List<String> selected_answers;
    public final String tagging_job_id;
    public final String tagging_question;
    public final String tagging_question_id;
    public final String tagging_question_object;
    
    static {
        ADAPTER = (a)new RaterTagAdapter(null);
    }
    
    private RaterTag(final Builder builder) {
        this.tagging_job_id = Builder.access$100(builder);
        this.tagging_question = Builder.access$200(builder);
        this.tagging_question_object = Builder.access$300(builder);
        this.module_type = Builder.access$400(builder);
        this.rating_type = Builder.access$500(builder);
        final List access$600 = Builder.access$600(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$600 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$600(builder));
        }
        this.selected_answers = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$700(builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$700(builder));
        }
        this.non_selected_answers = unmodifiableList2;
        this.tagging_question_id = Builder.access$800(builder);
        List<String> unmodifiableList3;
        if (Builder.access$900(builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Builder.access$900(builder));
        }
        this.selected_answer_ids = unmodifiableList3;
        List<String> unmodifiableList4;
        if (Builder.access$1000(builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends String>)Builder.access$1000(builder));
        }
        this.non_selected_answer_ids = unmodifiableList4;
    }
    
    public RaterTag(final Builder builder, final RaterTag$1 object) {
        this(builder);
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
        if (!(o instanceof RaterTag)) {
            return false;
        }
        final RaterTag raterTag = (RaterTag)o;
        final String tagging_job_id = this.tagging_job_id;
        final String tagging_job_id2 = raterTag.tagging_job_id;
        if (tagging_job_id == tagging_job_id2 || (tagging_job_id != null && tagging_job_id.equals(tagging_job_id2))) {
            final String tagging_question = this.tagging_question;
            final String tagging_question2 = raterTag.tagging_question;
            if (tagging_question == tagging_question2 || (tagging_question != null && tagging_question.equals(tagging_question2))) {
                final String tagging_question_object = this.tagging_question_object;
                final String tagging_question_object2 = raterTag.tagging_question_object;
                if (tagging_question_object == tagging_question_object2 || (tagging_question_object != null && tagging_question_object.equals(tagging_question_object2))) {
                    final String module_type = this.module_type;
                    final String module_type2 = raterTag.module_type;
                    if (module_type == module_type2 || (module_type != null && module_type.equals(module_type2))) {
                        final String rating_type = this.rating_type;
                        final String rating_type2 = raterTag.rating_type;
                        if (rating_type == rating_type2 || (rating_type != null && rating_type.equals(rating_type2))) {
                            final List<String> selected_answers = this.selected_answers;
                            final List<String> selected_answers2 = raterTag.selected_answers;
                            if (selected_answers == selected_answers2 || (selected_answers != null && selected_answers.equals(selected_answers2))) {
                                final List<String> non_selected_answers = this.non_selected_answers;
                                final List<String> non_selected_answers2 = raterTag.non_selected_answers;
                                if (non_selected_answers == non_selected_answers2 || (non_selected_answers != null && non_selected_answers.equals(non_selected_answers2))) {
                                    final String tagging_question_id = this.tagging_question_id;
                                    final String tagging_question_id2 = raterTag.tagging_question_id;
                                    if (tagging_question_id == tagging_question_id2 || (tagging_question_id != null && tagging_question_id.equals(tagging_question_id2))) {
                                        final List<String> selected_answer_ids = this.selected_answer_ids;
                                        final List<String> selected_answer_ids2 = raterTag.selected_answer_ids;
                                        if (selected_answer_ids == selected_answer_ids2 || (selected_answer_ids != null && selected_answer_ids.equals(selected_answer_ids2))) {
                                            final List<String> non_selected_answer_ids = this.non_selected_answer_ids;
                                            final List<String> non_selected_answer_ids2 = raterTag.non_selected_answer_ids;
                                            boolean b2 = b;
                                            if (non_selected_answer_ids == non_selected_answer_ids2) {
                                                return b2;
                                            }
                                            if (non_selected_answer_ids != null && non_selected_answer_ids.equals(non_selected_answer_ids2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String tagging_job_id = this.tagging_job_id;
        int hashCode = 0;
        int hashCode2;
        if (tagging_job_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tagging_job_id.hashCode();
        }
        final String tagging_question = this.tagging_question;
        int hashCode3;
        if (tagging_question == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = tagging_question.hashCode();
        }
        final String tagging_question_object = this.tagging_question_object;
        int hashCode4;
        if (tagging_question_object == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = tagging_question_object.hashCode();
        }
        final String module_type = this.module_type;
        int hashCode5;
        if (module_type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = module_type.hashCode();
        }
        final String rating_type = this.rating_type;
        int hashCode6;
        if (rating_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = rating_type.hashCode();
        }
        final List<String> selected_answers = this.selected_answers;
        int hashCode7;
        if (selected_answers == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = selected_answers.hashCode();
        }
        final List<String> non_selected_answers = this.non_selected_answers;
        int hashCode8;
        if (non_selected_answers == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = non_selected_answers.hashCode();
        }
        final String tagging_question_id = this.tagging_question_id;
        int hashCode9;
        if (tagging_question_id == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = tagging_question_id.hashCode();
        }
        final List<String> selected_answer_ids = this.selected_answer_ids;
        int hashCode10;
        if (selected_answer_ids == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = selected_answer_ids.hashCode();
        }
        final List<String> non_selected_answer_ids = this.non_selected_answer_ids;
        if (non_selected_answer_ids != null) {
            hashCode = non_selected_answer_ids.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RaterTag{tagging_job_id=");
        t.append(this.tagging_job_id);
        t.append(", tagging_question=");
        t.append(this.tagging_question);
        t.append(", tagging_question_object=");
        t.append(this.tagging_question_object);
        t.append(", module_type=");
        t.append(this.module_type);
        t.append(", rating_type=");
        t.append(this.rating_type);
        t.append(", selected_answers=");
        t.append(this.selected_answers);
        t.append(", non_selected_answers=");
        t.append(this.non_selected_answers);
        t.append(", tagging_question_id=");
        t.append(this.tagging_question_id);
        t.append(", selected_answer_ids=");
        t.append(this.selected_answer_ids);
        t.append(", non_selected_answer_ids=");
        return a.s(t, (List)this.non_selected_answer_ids, "}");
    }
    
    public void write(final e e) throws IOException {
        RaterTag.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<RaterTag>
    {
        private String module_type;
        private List<String> non_selected_answer_ids;
        private List<String> non_selected_answers;
        private String rating_type;
        private List<String> selected_answer_ids;
        private List<String> selected_answers;
        private String tagging_job_id;
        private String tagging_question;
        private String tagging_question_id;
        private String tagging_question_object;
        
        public Builder() {
        }
        
        public Builder(final RaterTag raterTag) {
            this.tagging_job_id = raterTag.tagging_job_id;
            this.tagging_question = raterTag.tagging_question;
            this.tagging_question_object = raterTag.tagging_question_object;
            this.module_type = raterTag.module_type;
            this.rating_type = raterTag.rating_type;
            this.selected_answers = raterTag.selected_answers;
            this.non_selected_answers = raterTag.non_selected_answers;
            this.tagging_question_id = raterTag.tagging_question_id;
            this.selected_answer_ids = raterTag.selected_answer_ids;
            this.non_selected_answer_ids = raterTag.non_selected_answer_ids;
        }
        
        public static String access$100(final Builder builder) {
            return builder.tagging_job_id;
        }
        
        public static List access$1000(final Builder builder) {
            return builder.non_selected_answer_ids;
        }
        
        public static String access$200(final Builder builder) {
            return builder.tagging_question;
        }
        
        public static String access$300(final Builder builder) {
            return builder.tagging_question_object;
        }
        
        public static String access$400(final Builder builder) {
            return builder.module_type;
        }
        
        public static String access$500(final Builder builder) {
            return builder.rating_type;
        }
        
        public static List access$600(final Builder builder) {
            return builder.selected_answers;
        }
        
        public static List access$700(final Builder builder) {
            return builder.non_selected_answers;
        }
        
        public static String access$800(final Builder builder) {
            return builder.tagging_question_id;
        }
        
        public static List access$900(final Builder builder) {
            return builder.selected_answer_ids;
        }
        
        public RaterTag build() {
            return new RaterTag(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder module_type(final String module_type) {
            this.module_type = module_type;
            return this;
        }
        
        public Builder non_selected_answer_ids(final List<String> non_selected_answer_ids) {
            this.non_selected_answer_ids = non_selected_answer_ids;
            return this;
        }
        
        public Builder non_selected_answers(final List<String> non_selected_answers) {
            this.non_selected_answers = non_selected_answers;
            return this;
        }
        
        public Builder rating_type(final String rating_type) {
            this.rating_type = rating_type;
            return this;
        }
        
        public void reset() {
            this.tagging_job_id = null;
            this.tagging_question = null;
            this.tagging_question_object = null;
            this.module_type = null;
            this.rating_type = null;
            this.selected_answers = null;
            this.non_selected_answers = null;
            this.tagging_question_id = null;
            this.selected_answer_ids = null;
            this.non_selected_answer_ids = null;
        }
        
        public Builder selected_answer_ids(final List<String> selected_answer_ids) {
            this.selected_answer_ids = selected_answer_ids;
            return this;
        }
        
        public Builder selected_answers(final List<String> selected_answers) {
            this.selected_answers = selected_answers;
            return this;
        }
        
        public Builder tagging_job_id(final String tagging_job_id) {
            this.tagging_job_id = tagging_job_id;
            return this;
        }
        
        public Builder tagging_question(final String tagging_question) {
            this.tagging_question = tagging_question;
            return this;
        }
        
        public Builder tagging_question_id(final String tagging_question_id) {
            this.tagging_question_id = tagging_question_id;
            return this;
        }
        
        public Builder tagging_question_object(final String tagging_question_object) {
            this.tagging_question_object = tagging_question_object;
            return this;
        }
    }
    
    public static final class RaterTagAdapter implements a<RaterTag, Builder>
    {
        private RaterTagAdapter() {
        }
        
        public RaterTagAdapter(final RaterTag$1 object) {
            this();
        }
        
        public RaterTag read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public RaterTag read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                int i = 0;
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                switch (b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 15) {
                            final c w = e.w();
                            final ArrayList list = new ArrayList(w.b);
                            for (int j = n3; j < w.b; j = k.f(e, list, j, 1)) {}
                            e.x();
                            builder.non_selected_answer_ids((List<String>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 15) {
                            c w2;
                            ArrayList list2;
                            for (w2 = e.w(), list2 = new ArrayList(w2.b); i < w2.b; i = k.f(e, list2, i, 1)) {}
                            e.x();
                            builder.selected_answer_ids((List<String>)list2);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.tagging_question_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 15) {
                            final c w3 = e.w();
                            final ArrayList list3 = new ArrayList(w3.b);
                            for (int k = n; k < w3.b; k = k.f(e, list3, k, 1)) {}
                            e.x();
                            builder.non_selected_answers((List<String>)list3);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 15) {
                            final c w4 = e.w();
                            final ArrayList list4 = new ArrayList(w4.b);
                            for (int l = n2; l < w4.b; l = k.f(e, list4, l, 1)) {}
                            e.x();
                            builder.selected_answers((List<String>)list4);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.rating_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.module_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.tagging_question_object(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.tagging_question(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.tagging_job_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final RaterTag raterTag) throws IOException {
            e.X();
            if (raterTag.tagging_job_id != null) {
                e.O(1, (byte)11);
                e.W(raterTag.tagging_job_id);
                e.P();
            }
            if (raterTag.tagging_question != null) {
                e.O(2, (byte)11);
                e.W(raterTag.tagging_question);
                e.P();
            }
            if (raterTag.tagging_question_object != null) {
                e.O(3, (byte)11);
                e.W(raterTag.tagging_question_object);
                e.P();
            }
            if (raterTag.module_type != null) {
                e.O(4, (byte)11);
                e.W(raterTag.module_type);
                e.P();
            }
            if (raterTag.rating_type != null) {
                e.O(5, (byte)11);
                e.W(raterTag.rating_type);
                e.P();
            }
            if (raterTag.selected_answers != null) {
                e.O(6, (byte)15);
                e.U((byte)11, raterTag.selected_answers.size());
                final Iterator<String> iterator = raterTag.selected_answers.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (raterTag.non_selected_answers != null) {
                e.O(7, (byte)15);
                e.U((byte)11, raterTag.non_selected_answers.size());
                final Iterator<String> iterator2 = raterTag.non_selected_answers.iterator();
                while (iterator2.hasNext()) {
                    e.W((String)iterator2.next());
                }
                e.V();
                e.P();
            }
            if (raterTag.tagging_question_id != null) {
                e.O(8, (byte)11);
                e.W(raterTag.tagging_question_id);
                e.P();
            }
            if (raterTag.selected_answer_ids != null) {
                e.O(9, (byte)15);
                e.U((byte)11, raterTag.selected_answer_ids.size());
                final Iterator<String> iterator3 = raterTag.selected_answer_ids.iterator();
                while (iterator3.hasNext()) {
                    e.W((String)iterator3.next());
                }
                e.V();
                e.P();
            }
            if (raterTag.non_selected_answer_ids != null) {
                e.O(10, (byte)15);
                e.U((byte)11, raterTag.non_selected_answer_ids.size());
                final Iterator<String> iterator4 = raterTag.non_selected_answer_ids.iterator();
                while (iterator4.hasNext()) {
                    e.W((String)iterator4.next());
                }
                e.V();
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (RaterTag)o);
        }
    }
}
