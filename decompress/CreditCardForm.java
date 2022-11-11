// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class CreditCardForm
{
    public static final a<CreditCardForm, CreditCardForm.CreditCardForm$Builder> ADAPTER;
    public final List<String> completed_fields;
    public final String field_errors;
    public final String submission_error;
    public final Boolean submitted;
    public final Boolean success;
    public final List<String> uncompleted_fields;
    
    static {
        ADAPTER = (a)new CreditCardForm.CreditCardForm$CreditCardFormAdapter((CreditCardForm$1)null);
    }
    
    private CreditCardForm(final CreditCardForm.CreditCardForm$Builder creditCardForm$Builder) {
        final List access$100 = CreditCardForm.CreditCardForm$Builder.access$100(creditCardForm$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)CreditCardForm.CreditCardForm$Builder.access$100(creditCardForm$Builder));
        }
        this.completed_fields = unmodifiableList;
        List<String> unmodifiableList2;
        if (CreditCardForm.CreditCardForm$Builder.access$200(creditCardForm$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)CreditCardForm.CreditCardForm$Builder.access$200(creditCardForm$Builder));
        }
        this.uncompleted_fields = unmodifiableList2;
        this.submitted = CreditCardForm.CreditCardForm$Builder.access$300(creditCardForm$Builder);
        this.success = CreditCardForm.CreditCardForm$Builder.access$400(creditCardForm$Builder);
        this.field_errors = CreditCardForm.CreditCardForm$Builder.access$500(creditCardForm$Builder);
        this.submission_error = CreditCardForm.CreditCardForm$Builder.access$600(creditCardForm$Builder);
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
        if (!(o instanceof CreditCardForm)) {
            return false;
        }
        final CreditCardForm creditCardForm = (CreditCardForm)o;
        final List<String> completed_fields = this.completed_fields;
        final List<String> completed_fields2 = creditCardForm.completed_fields;
        if (completed_fields == completed_fields2 || (completed_fields != null && completed_fields.equals(completed_fields2))) {
            final List<String> uncompleted_fields = this.uncompleted_fields;
            final List<String> uncompleted_fields2 = creditCardForm.uncompleted_fields;
            if (uncompleted_fields == uncompleted_fields2 || (uncompleted_fields != null && uncompleted_fields.equals(uncompleted_fields2))) {
                final Boolean submitted = this.submitted;
                final Boolean submitted2 = creditCardForm.submitted;
                if (submitted == submitted2 || (submitted != null && submitted.equals(submitted2))) {
                    final Boolean success = this.success;
                    final Boolean success2 = creditCardForm.success;
                    if (success == success2 || (success != null && success.equals(success2))) {
                        final String field_errors = this.field_errors;
                        final String field_errors2 = creditCardForm.field_errors;
                        if (field_errors == field_errors2 || (field_errors != null && field_errors.equals(field_errors2))) {
                            final String submission_error = this.submission_error;
                            final String submission_error2 = creditCardForm.submission_error;
                            boolean b2 = b;
                            if (submission_error == submission_error2) {
                                return b2;
                            }
                            if (submission_error != null && submission_error.equals(submission_error2)) {
                                b2 = b;
                                return b2;
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
        final List<String> completed_fields = this.completed_fields;
        int hashCode = 0;
        int hashCode2;
        if (completed_fields == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = completed_fields.hashCode();
        }
        final List<String> uncompleted_fields = this.uncompleted_fields;
        int hashCode3;
        if (uncompleted_fields == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = uncompleted_fields.hashCode();
        }
        final Boolean submitted = this.submitted;
        int hashCode4;
        if (submitted == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = submitted.hashCode();
        }
        final Boolean success = this.success;
        int hashCode5;
        if (success == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = success.hashCode();
        }
        final String field_errors = this.field_errors;
        int hashCode6;
        if (field_errors == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = field_errors.hashCode();
        }
        final String submission_error = this.submission_error;
        if (submission_error != null) {
            hashCode = submission_error.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CreditCardForm{completed_fields=");
        k.append(this.completed_fields);
        k.append(", uncompleted_fields=");
        k.append(this.uncompleted_fields);
        k.append(", submitted=");
        k.append(this.submitted);
        k.append(", success=");
        k.append(this.success);
        k.append(", field_errors=");
        k.append(this.field_errors);
        k.append(", submission_error=");
        return b.j(k, this.submission_error, "}");
    }
    
    public void write(final e e) throws IOException {
        CreditCardForm.ADAPTER.write(e, (Object)this);
    }
}
