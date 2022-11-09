// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ApiResponse
{
    public static final a<ApiResponse, ApiResponse.ApiResponse$Builder> ADAPTER;
    public final String content;
    public final String error;
    public final String error_name;
    public final Integer response_code;
    
    static {
        ADAPTER = (a)new ApiResponse.ApiResponse$ApiResponseAdapter((ApiResponse$1)null);
    }
    
    private ApiResponse(final ApiResponse.ApiResponse$Builder apiResponse$Builder) {
        this.response_code = ApiResponse.ApiResponse$Builder.access$100(apiResponse$Builder);
        this.error_name = ApiResponse.ApiResponse$Builder.access$200(apiResponse$Builder);
        this.error = ApiResponse.ApiResponse$Builder.access$300(apiResponse$Builder);
        this.content = ApiResponse.ApiResponse$Builder.access$400(apiResponse$Builder);
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
        if (!(o instanceof ApiResponse)) {
            return false;
        }
        final ApiResponse apiResponse = (ApiResponse)o;
        final Integer response_code = this.response_code;
        final Integer response_code2 = apiResponse.response_code;
        if (response_code == response_code2 || (response_code != null && response_code.equals(response_code2))) {
            final String error_name = this.error_name;
            final String error_name2 = apiResponse.error_name;
            if (error_name == error_name2 || (error_name != null && error_name.equals(error_name2))) {
                final String error = this.error;
                final String error2 = apiResponse.error;
                if (error == error2 || (error != null && error.equals(error2))) {
                    final String content = this.content;
                    final String content2 = apiResponse.content;
                    boolean b2 = b;
                    if (content == content2) {
                        return b2;
                    }
                    if (content != null && content.equals(content2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer response_code = this.response_code;
        int hashCode = 0;
        int hashCode2;
        if (response_code == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = response_code.hashCode();
        }
        final String error_name = this.error_name;
        int hashCode3;
        if (error_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = error_name.hashCode();
        }
        final String error = this.error;
        int hashCode4;
        if (error == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = error.hashCode();
        }
        final String content = this.content;
        if (content != null) {
            hashCode = content.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ApiResponse{response_code=");
        k.append(this.response_code);
        k.append(", error_name=");
        k.append(this.error_name);
        k.append(", error=");
        k.append(this.error);
        k.append(", content=");
        return b.j(k, this.content, "}");
    }
    
    public void write(final e e) throws IOException {
        ApiResponse.ADAPTER.write(e, (Object)this);
    }
}
