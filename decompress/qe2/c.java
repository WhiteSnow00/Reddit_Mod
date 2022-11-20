// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import ng2.e;

public final class c
{
    public final int a;
    public int b;
    public String c;
    
    public c(final int b, final String c) {
        this.a = 1;
        e.f((Object)c, "server");
        this.b = b;
        this.c = c;
    }
    
    public c(String s, final int n) {
        this.a = 0;
        this.c = "";
        this.b = -113;
        final StringBuilder t = a.t(s);
        if (n == -113) {
            this.b = -113;
            s = " Branch API Error: poor network connectivity. Please try again later.";
        }
        else if (n == -114) {
            this.b = -114;
            s = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        }
        else if (n == -104) {
            this.b = -104;
            s = " Did you forget to call init? Make sure you init the session before making Branch calls.";
        }
        else if (n == -101) {
            this.b = -101;
            s = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        }
        else if (n == -102) {
            this.b = -102;
            s = " Please add 'android.permission.INTERNET' in your applications manifest file.";
        }
        else if (n == -105) {
            this.b = -105;
            s = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        }
        else if (n == -108) {
            this.b = -108;
            s = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        }
        else if (n == -109) {
            this.b = -109;
            s = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        }
        else if (n == -110) {
            this.b = -110;
            s = " Unable create share options. Couldn't find applications on device to share the link.";
        }
        else if (n == -111) {
            this.b = -111;
            s = " Request to Branch server timed out. Please check your internet connectivity";
        }
        else if (n == -117) {
            this.b = -117;
            s = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        }
        else if (n == -118) {
            this.b = -118;
            s = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
        }
        else if (n < 500 && n != -112) {
            if (n != 409 && n != -115) {
                if (n < 400 && n != -116) {
                    if (n == -119) {
                        this.b = -119;
                        s = "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
                    }
                    else if (n == -120) {
                        this.b = -120;
                        s = " Task exceeded timeout.";
                    }
                    else {
                        this.b = -113;
                        s = " Check network connectivity and that you properly initialized.";
                    }
                }
                else {
                    this.b = -116;
                    s = " The request was invalid.";
                }
            }
            else {
                this.b = -115;
                s = " A resource with this identifier already exists.";
            }
        }
        else {
            this.b = -112;
            s = " Unable to reach the Branch servers, please try again shortly.";
        }
        t.append(s);
        this.c = t.toString();
    }
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 0: {
                return this.c;
            }
        }
    }
}
