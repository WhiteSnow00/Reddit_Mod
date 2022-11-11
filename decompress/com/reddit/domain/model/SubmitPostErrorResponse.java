// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import cj2.j;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0004j\u0002`\u0005H\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\fR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/SubmitPostErrorResponse;", "", "", "message", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "destination", "Lhg2/j;", "addErrorMessage", "error", "Lcom/reddit/domain/model/ValidationError;", "stringToValidationError", "", "hasErrors", "isSubmitError", "ignoreUnsupportedTypes", "Lcom/reddit/domain/model/PostSubmitValidationErrors;", "getValidationErrors", "", "errors", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "getFirstError", "()Ljava/lang/String;", "firstError", "<init>", "(Ljava/util/List;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitPostErrorResponse
{
    private static final String BODY = "body";
    public static final Companion Companion;
    private static final int ERROR_FIELD_INDEX = 2;
    private static final int ERROR_INDEX = 0;
    private static final int ERROR_MESSAGE_INDEX = 1;
    private static final String FLAIR = "flair";
    private static final String LINK = "link";
    private static final String NEW_LINE = "\n";
    private static final String SUBMIT_VALIDATION = "SUBMIT_VALIDATION";
    private static final String TITLE = "title";
    private final List<List<String>> errors;
    
    static {
        Companion = new Companion(null);
    }
    
    public SubmitPostErrorResponse(@n(name = "errors") final List<? extends List<String>> errors) {
        e.f((Object)errors, "errors");
        this.errors = (List<List<String>>)errors;
    }
    
    private final void addErrorMessage(final String s, final StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append("\n");
        }
        sb.append(s);
    }
    
    private final ValidationError stringToValidationError(final StringBuilder sb) {
        final boolean b = sb.length() > 0;
        ValidationError validationError = null;
        if (b) {
            final String string = sb.toString();
            e.e((Object)string, "error.toString()");
            validationError = new ValidationError(string, false, 2, (DefaultConstructorMarker)null);
        }
        return validationError;
    }
    
    public final List<List<String>> getErrors() {
        return this.errors;
    }
    
    public final String getFirstError() {
        final List list = (List)CollectionsKt___CollectionsKt.C3((List)this.errors);
        String s = null;
        if (list != null) {
            s = s;
            if (list.size() > 1) {
                s = list.get(1);
            }
        }
        return s;
    }
    
    public final PostSubmitValidationErrors getValidationErrors(final boolean b) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        final StringBuilder sb3 = new StringBuilder();
        for (final List list : this.errors) {
            if (list.size() > 2) {
                final String s = (String)list.get(2);
                StringBuilder sb4 = null;
                Label_0209: {
                    Label_0202: {
                        switch (s.hashCode()) {
                            default: {
                                break Label_0202;
                            }
                            case 110371416: {
                                if (!s.equals("title")) {
                                    break Label_0202;
                                }
                                sb4 = sb;
                                break Label_0209;
                            }
                            case 97513156: {
                                if (!s.equals("flair")) {
                                    break Label_0202;
                                }
                                sb4 = sb2;
                                break Label_0209;
                            }
                            case 3321850: {
                                if (!s.equals("link")) {
                                    break Label_0202;
                                }
                                break;
                            }
                            case 3029410: {
                                if (!s.equals("body")) {
                                    break Label_0202;
                                }
                                break;
                            }
                        }
                        sb4 = sb3;
                        break Label_0209;
                    }
                    if (!b) {
                        final StringBuilder r = a.r("Unexpected submit validation error type : ");
                        r.append((String)list.get(2));
                        throw new IllegalArgumentException(r.toString());
                    }
                    sb4 = null;
                }
                if (sb4 == null) {
                    continue;
                }
                this.addErrorMessage((String)list.get(1), sb4);
            }
        }
        return new PostSubmitValidationErrors(this.stringToValidationError(sb), this.stringToValidationError(sb2), this.stringToValidationError(sb3));
    }
    
    public final boolean hasErrors() {
        return this.errors.isEmpty() ^ true;
    }
    
    public final boolean isSubmitError() {
        final List list = (List)CollectionsKt___CollectionsKt.C3((List)this.errors);
        boolean b2;
        final boolean b = b2 = false;
        if (list != null) {
            b2 = b;
            if (list.size() > 0) {
                b2 = b;
                if (!j.O0((String)list.get(0), "SUBMIT_VALIDATION", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/model/SubmitPostErrorResponse$Companion;", "", "()V", "BODY", "", "ERROR_FIELD_INDEX", "", "ERROR_INDEX", "ERROR_MESSAGE_INDEX", "FLAIR", "LINK", "NEW_LINE", "SUBMIT_VALIDATION", "TITLE", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
