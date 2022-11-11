// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.EditText;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import a4.c2;
import android.widget.AutoCompleteTextView;
import android.view.KeyEvent$DispatcherState;
import android.util.TypedValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.reflect.Method;
import android.content.res.Configuration;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.TouchDelegate;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import a4.p0;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View$OnKeyListener;
import android.content.ComponentName;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.database.Cursor;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.os.Bundle;
import android.app.SearchableInfo;
import f4.a;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import k.c;

public class SearchView extends LinearLayoutCompat implements c
{
    public static final o a0;
    public m A;
    public View$OnFocusChangeListener B;
    public View$OnClickListener C;
    public boolean D;
    public boolean E;
    public f4.a F;
    public boolean G;
    public CharSequence H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public String M;
    public CharSequence N;
    public boolean O;
    public int P;
    public SearchableInfo Q;
    public Bundle R;
    public final SearchView$b S;
    public SearchView$c T;
    public final WeakHashMap<String, Drawable$ConstantState> U;
    public SearchView$g V;
    public SearchView$a W;
    public final SearchAutoComplete f;
    public final View g;
    public final View h;
    public final View i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final ImageView m;
    public final View n;
    public q o;
    public Rect p;
    public Rect q;
    public int[] r;
    public int[] s;
    public final ImageView t;
    public final Drawable u;
    public final int v;
    public final int w;
    public final Intent x;
    public final Intent y;
    public final CharSequence z;
    
    static {
        o a;
        if (Build$VERSION.SDK_INT < 29) {
            a = new o();
        }
        else {
            a = null;
        }
        a0 = a;
    }
    
    public SearchView(final Context context) {
        this(context, null);
    }
    
    public SearchView(final Context context, final AttributeSet set) {
        this(context, set, 2130969743);
    }
    
    public SearchView(final Context context, final AttributeSet set, int inputType) {
        super(context, set, inputType);
        this.p = new Rect();
        this.q = new Rect();
        this.r = new int[2];
        this.s = new int[2];
        this.S = new Runnable() {
            @Override
            public final void run() {
                SearchView.this.m();
            }
        };
        this.T = new Runnable() {
            @Override
            public final void run() {
                final f4.a f = SearchView.this.F;
                if (f instanceof t0) {
                    f.c(null);
                }
            }
        };
        this.U = new WeakHashMap<String, Drawable$ConstantState>();
        final View$OnClickListener onClickListener = (View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                final SearchView f = SearchView.this;
                if (view == f.j) {
                    f.q(false);
                    ((View)f.f).requestFocus();
                    f.f.setImeVisibility(true);
                    final View$OnClickListener c = f.C;
                    if (c != null) {
                        c.onClick((View)f);
                    }
                }
                else if (view == f.l) {
                    f.g();
                }
                else if (view == f.k) {
                    f.k();
                }
                else if (view == f.m) {
                    final SearchableInfo q = f.Q;
                    if (q != null) {
                        try {
                            if (q.getVoiceSearchLaunchWebSearch()) {
                                final Intent intent = new Intent(f.x);
                                final ComponentName searchActivity = q.getSearchActivity();
                                String flattenToShortString;
                                if (searchActivity == null) {
                                    flattenToShortString = null;
                                }
                                else {
                                    flattenToShortString = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", flattenToShortString);
                                ((View)f).getContext().startActivity(intent);
                            }
                            else if (q.getVoiceSearchLaunchRecognizer()) {
                                ((View)f).getContext().startActivity(f.e(f.y, q));
                            }
                        }
                        catch (final ActivityNotFoundException ex) {
                            Log.w("SearchView", "Could not find voice search activity");
                        }
                    }
                }
                else if (view == f.f) {
                    f.f();
                }
            }
        };
        this.V = new View$OnKeyListener() {
            public final boolean onKey(final View view, int length, final KeyEvent keyEvent) {
                final SearchView f = SearchView.this;
                final SearchableInfo q = f.Q;
                final boolean b = false;
                if (q == null) {
                    return false;
                }
                if (f.f.isPopupShowing() && SearchView.this.f.getListSelection() != -1) {
                    final SearchView f2 = SearchView.this;
                    boolean h;
                    if (f2.Q == null) {
                        h = b;
                    }
                    else if (f2.F == null) {
                        h = b;
                    }
                    else {
                        h = b;
                        if (keyEvent.getAction() == 0) {
                            h = b;
                            if (keyEvent.hasNoModifiers()) {
                                if (length != 66 && length != 84 && length != 61) {
                                    if (length != 21 && length != 22) {
                                        h = b;
                                        if (length == 19) {
                                            f2.f.getListSelection();
                                            h = b;
                                        }
                                    }
                                    else {
                                        if (length == 21) {
                                            length = 0;
                                        }
                                        else {
                                            length = ((TextView)f2.f).length();
                                        }
                                        ((EditText)f2.f).setSelection(length);
                                        f2.f.setListSelection(0);
                                        f2.f.clearListSelection();
                                        f2.f.a();
                                        h = true;
                                    }
                                }
                                else {
                                    h = f2.h(f2.f.getListSelection());
                                }
                            }
                        }
                    }
                    return h;
                }
                if (TextUtils.getTrimmedLength((CharSequence)((EditText)SearchView.this.f).getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && length == 66) {
                    view.cancelLongPress();
                    final SearchView f3 = SearchView.this;
                    ((View)f3).getContext().startActivity(f3.d("android.intent.action.SEARCH", null, null, ((EditText)f3.f).getText().toString()));
                    return true;
                }
                return false;
            }
        };
        final TextView$OnEditorActionListener onEditorActionListener = (TextView$OnEditorActionListener)new TextView$OnEditorActionListener() {
            public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
                SearchView.this.k();
                return true;
            }
        };
        final AdapterView$OnItemClickListener onItemClickListener = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                SearchView.this.h(n);
            }
        };
        final AdapterView$OnItemSelectedListener onItemSelectedListener = (AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                SearchView.this.i(n);
            }
            
            public final void onNothingSelected(final AdapterView<?> adapterView) {
            }
        };
        this.W = new TextWatcher() {
            public final void afterTextChanged(final Editable editable) {
            }
            
            public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public final void onTextChanged(final CharSequence charSequence, int visibility, int n, final int n2) {
                final SearchView f = SearchView.this;
                final Editable text = ((EditText)f.f).getText();
                f.N = (CharSequence)text;
                final boolean b = TextUtils.isEmpty((CharSequence)text) ^ true;
                f.p(b);
                final boolean l = f.L;
                n = (visibility = 8);
                if (l) {
                    visibility = n;
                    if (!f.E) {
                        visibility = n;
                        if (b ^ true) {
                            f.k.setVisibility(8);
                            visibility = 0;
                        }
                    }
                }
                f.m.setVisibility(visibility);
                f.l();
                f.o();
                if (f.A != null && !TextUtils.equals(charSequence, (CharSequence)f.M)) {
                    f.A.a(charSequence.toString());
                }
                f.M = charSequence.toString();
            }
        };
        final int[] k0 = gn.a.k0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, k0, inputType, 0);
        final z0 z0 = new z0(context, obtainStyledAttributes);
        p0.k((View)this, context, k0, set, obtainStyledAttributes, inputType);
        LayoutInflater.from(context).inflate(z0.i(9, 2131624011), (ViewGroup)this, true);
        final SearchAutoComplete f = (SearchAutoComplete)((View)this).findViewById(2131431143);
        (this.f = f).setSearchView(this);
        this.g = ((View)this).findViewById(2131431116);
        final View viewById = ((View)this).findViewById(2131431129);
        this.h = viewById;
        final View viewById2 = ((View)this).findViewById(2131431523);
        this.i = viewById2;
        final ImageView j = (ImageView)((View)this).findViewById(2131431109);
        this.j = j;
        final ImageView i = (ImageView)((View)this).findViewById(2131431122);
        this.k = i;
        final ImageView l = (ImageView)((View)this).findViewById(2131431112);
        this.l = l;
        final ImageView m = (ImageView)((View)this).findViewById(2131431149);
        this.m = m;
        final ImageView t = (ImageView)((View)this).findViewById(2131431128);
        this.t = t;
        p0.d.q(viewById, z0.e(10));
        p0.d.q(viewById2, z0.e(14));
        j.setImageDrawable(z0.e(13));
        i.setImageDrawable(z0.e(7));
        l.setImageDrawable(z0.e(4));
        m.setImageDrawable(z0.e(16));
        t.setImageDrawable(z0.e(13));
        this.u = z0.e(12);
        d1.a((View)j, ((View)this).getResources().getString(2131951650));
        this.v = z0.i(15, 2131624010);
        this.w = z0.i(5, 0);
        ((View)j).setOnClickListener((View$OnClickListener)onClickListener);
        ((View)l).setOnClickListener((View$OnClickListener)onClickListener);
        ((View)i).setOnClickListener((View$OnClickListener)onClickListener);
        ((View)m).setOnClickListener((View$OnClickListener)onClickListener);
        ((View)f).setOnClickListener((View$OnClickListener)onClickListener);
        ((TextView)f).addTextChangedListener((TextWatcher)this.W);
        ((TextView)f).setOnEditorActionListener((TextView$OnEditorActionListener)onEditorActionListener);
        f.setOnItemClickListener((AdapterView$OnItemClickListener)onItemClickListener);
        f.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)onItemSelectedListener);
        ((View)f).setOnKeyListener((View$OnKeyListener)this.V);
        ((View)f).setOnFocusChangeListener((View$OnFocusChangeListener)new View$OnFocusChangeListener() {
            public final void onFocusChange(final View view, final boolean b) {
                final SearchView f = SearchView.this;
                final View$OnFocusChangeListener b2 = f.B;
                if (b2 != null) {
                    b2.onFocusChange((View)f, b);
                }
            }
        });
        this.setIconifiedByDefault(z0.a(8, true));
        inputType = z0.d(1, -1);
        if (inputType != -1) {
            this.setMaxWidth(inputType);
        }
        this.z = z0.k(6);
        this.H = z0.k(11);
        inputType = z0.h(3, -1);
        if (inputType != -1) {
            this.setImeOptions(inputType);
        }
        inputType = z0.h(2, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        ((View)this).setFocusable(z0.a(0, true));
        z0.n();
        final Intent x = new Intent("android.speech.action.WEB_SEARCH");
        (this.x = x).addFlags(268435456);
        x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.y = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        final View viewById3 = ((View)this).findViewById(f.getDropDownAnchor());
        if ((this.n = viewById3) != null) {
            viewById3.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public final void onLayoutChange(final View view, int dimensionPixelSize, int left, int paddingLeft, int right, int width, final int n, final int n2, final int n3) {
                    final SearchView f = SearchView.this;
                    if (f.n.getWidth() > 1) {
                        final Resources resources = ((View)f).getContext().getResources();
                        paddingLeft = f.h.getPaddingLeft();
                        final Rect rect = new Rect();
                        final boolean a = i1.a((View)f);
                        if (f.D) {
                            dimensionPixelSize = resources.getDimensionPixelSize(2131165226);
                            dimensionPixelSize += resources.getDimensionPixelSize(2131165227);
                        }
                        else {
                            dimensionPixelSize = 0;
                        }
                        f.f.getDropDownBackground().getPadding(rect);
                        if (a) {
                            left = -rect.left;
                        }
                        else {
                            left = paddingLeft - (rect.left + dimensionPixelSize);
                        }
                        f.f.setDropDownHorizontalOffset(left);
                        width = f.n.getWidth();
                        left = rect.left;
                        right = rect.right;
                        f.f.setDropDownWidth(width + left + right + dimensionPixelSize - paddingLeft);
                    }
                }
            });
        }
        this.q(this.D);
        this.n();
    }
    
    private int getPreferredHeight() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(2131165239);
    }
    
    private int getPreferredWidth() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(2131165240);
    }
    
    private void setQuery(final CharSequence text) {
        ((TextView)this.f).setText(text);
        final SearchAutoComplete f = this.f;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        ((EditText)f).setSelection(length);
    }
    
    public final void clearFocus() {
        this.J = true;
        super.clearFocus();
        ((View)this.f).clearFocus();
        this.f.setImeVisibility(false);
        this.J = false;
    }
    
    public final Intent d(final String s, final Uri data, final String s2, final String s3) {
        final Intent intent = new Intent(s);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.N);
        if (s3 != null) {
            intent.putExtra("query", s3);
        }
        if (s2 != null) {
            intent.putExtra("intent_extra_data_key", s2);
        }
        final Bundle r = this.R;
        if (r != null) {
            intent.putExtra("app_data", r);
        }
        intent.setComponent(this.Q.getSearchActivity());
        return intent;
    }
    
    public final Intent e(final Intent intent, final SearchableInfo searchableInfo) {
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        final Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        final PendingIntent activity = PendingIntent.getActivity(((View)this).getContext(), 0, intent2, 1107296256);
        final Bundle bundle = new Bundle();
        final Bundle r = this.R;
        if (r != null) {
            bundle.putParcelable("app_data", (Parcelable)r);
        }
        final Intent intent3 = new Intent(intent);
        int voiceMaxResults = 1;
        final Resources resources = ((View)this).getResources();
        String string;
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        else {
            string = "free_form";
        }
        final int voicePromptTextId = searchableInfo.getVoicePromptTextId();
        final String s = null;
        String string2;
        if (voicePromptTextId != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        }
        else {
            string2 = null;
        }
        String string3;
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        }
        else {
            string3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = s;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", flattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }
    
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          29
        //     5: if_icmplt       18
        //     8: aload_0        
        //     9: getfield        androidx/appcompat/widget/SearchView.f:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    12: invokestatic    androidx/appcompat/widget/SearchView$k.a:(Landroid/widget/AutoCompleteTextView;)V
        //    15: goto            90
        //    18: getstatic       androidx/appcompat/widget/SearchView.a0:Landroidx/appcompat/widget/SearchView$o;
        //    21: astore_1       
        //    22: aload_0        
        //    23: getfield        androidx/appcompat/widget/SearchView.f:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    26: astore_2       
        //    27: aload_1        
        //    28: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    31: pop            
        //    32: invokestatic    androidx/appcompat/widget/SearchView$o.a:()V
        //    35: aload_1        
        //    36: getfield        androidx/appcompat/widget/SearchView$o.a:Ljava/lang/reflect/Method;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          54
        //    44: aload_1        
        //    45: aload_2        
        //    46: iconst_0       
        //    47: anewarray       Ljava/lang/Object;
        //    50: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    53: pop            
        //    54: getstatic       androidx/appcompat/widget/SearchView.a0:Landroidx/appcompat/widget/SearchView$o;
        //    57: astore_1       
        //    58: aload_0        
        //    59: getfield        androidx/appcompat/widget/SearchView.f:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
        //    62: astore_2       
        //    63: aload_1        
        //    64: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    67: pop            
        //    68: invokestatic    androidx/appcompat/widget/SearchView$o.a:()V
        //    71: aload_1        
        //    72: getfield        androidx/appcompat/widget/SearchView$o.b:Ljava/lang/reflect/Method;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ifnull          90
        //    80: aload_1        
        //    81: aload_2        
        //    82: iconst_0       
        //    83: anewarray       Ljava/lang/Object;
        //    86: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    89: pop            
        //    90: return         
        //    91: astore_2       
        //    92: goto            54
        //    95: astore_2       
        //    96: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     54     91     95     Ljava/lang/Exception;
        //  80     90     95     99     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void g() {
        if (TextUtils.isEmpty((CharSequence)((EditText)this.f).getText())) {
            if (this.D) {
                this.clearFocus();
                this.q(true);
            }
        }
        else {
            ((TextView)this.f).setText((CharSequence)"");
            ((View)this.f).requestFocus();
            this.f.setImeVisibility(true);
        }
    }
    
    public int getImeOptions() {
        return ((TextView)this.f).getImeOptions();
    }
    
    public int getInputType() {
        return ((TextView)this.f).getInputType();
    }
    
    public int getMaxWidth() {
        return this.K;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)((EditText)this.f).getText();
    }
    
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.H;
        if (charSequence == null) {
            final SearchableInfo q = this.Q;
            if (q != null && q.getHintId() != 0) {
                charSequence = ((View)this).getContext().getText(this.Q.getHintId());
            }
            else {
                charSequence = this.z;
            }
        }
        return charSequence;
    }
    
    public int getSuggestionCommitIconResId() {
        return this.w;
    }
    
    public int getSuggestionRowLayout() {
        return this.v;
    }
    
    public f4.a getSuggestionsAdapter() {
        return this.F;
    }
    
    public final boolean h(int n) {
        final Cursor h = this.F.h;
        if (h != null && h.moveToPosition(n)) {
            final Intent intent = null;
            Intent d;
            try {
                n = t0.C;
                String s;
                if ((s = t0.i(h, h.getColumnIndex("suggest_intent_action"))) == null) {
                    s = this.Q.getSuggestIntentAction();
                }
                String s2;
                if ((s2 = s) == null) {
                    s2 = "android.intent.action.SEARCH";
                }
                String s3;
                if ((s3 = t0.i(h, h.getColumnIndex("suggest_intent_data"))) == null) {
                    s3 = this.Q.getSuggestIntentData();
                }
                String string;
                if ((string = s3) != null) {
                    final String i = t0.i(h, h.getColumnIndex("suggest_intent_data_id"));
                    string = s3;
                    if (i != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s3);
                        sb.append("/");
                        sb.append(Uri.encode(i));
                        string = sb.toString();
                    }
                }
                Uri parse;
                if (string == null) {
                    parse = null;
                }
                else {
                    parse = Uri.parse(string);
                }
                d = this.d(s2, parse, t0.i(h, h.getColumnIndex("suggest_intent_extra_data")), t0.i(h, h.getColumnIndex("suggest_intent_query")));
            }
            catch (final RuntimeException ex) {
                try {
                    n = h.getPosition();
                }
                catch (final RuntimeException ex2) {
                    n = -1;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Search suggestions cursor at row ");
                sb2.append(n);
                sb2.append(" returned exception.");
                Log.w("SearchView", sb2.toString(), (Throwable)ex);
                d = intent;
            }
            if (d != null) {
                try {
                    ((View)this).getContext().startActivity(d);
                }
                catch (final RuntimeException ex3) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed launch activity: ");
                    sb3.append(d);
                    Log.e("SearchView", sb3.toString(), (Throwable)ex3);
                }
            }
        }
        this.f.setImeVisibility(false);
        this.f.dismissDropDown();
        return true;
    }
    
    public final void i(final int n) {
        final Editable text = ((EditText)this.f).getText();
        final Cursor h = this.F.h;
        if (h != null) {
            if (h.moveToPosition(n)) {
                final String d = this.F.d(h);
                if (d != null) {
                    this.setQuery(d);
                }
                else {
                    this.setQuery((CharSequence)text);
                }
            }
            else {
                this.setQuery((CharSequence)text);
            }
        }
    }
    
    public final void j(final CharSequence query) {
        this.setQuery(query);
    }
    
    public final void k() {
        final Editable text = ((EditText)this.f).getText();
        if (text != null && TextUtils.getTrimmedLength((CharSequence)text) > 0) {
            final m a = this.A;
            if (a != null) {
                a.b(((CharSequence)text).toString());
            }
            if (this.Q != null) {
                ((View)this).getContext().startActivity(this.d("android.intent.action.SEARCH", null, null, ((CharSequence)text).toString()));
            }
            this.f.setImeVisibility(false);
            this.f.dismissDropDown();
        }
    }
    
    public final void l() {
        final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)this.f).getText());
        final boolean b = true;
        final boolean b2 = empty ^ true;
        final int n = 0;
        int n2 = b ? 1 : 0;
        if (!b2) {
            if (this.D && !this.O) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        final ImageView l = this.l;
        int visibility;
        if (n2 != 0) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        l.setVisibility(visibility);
        final Drawable drawable = this.l.getDrawable();
        if (drawable != null) {
            int[] state;
            if (b2) {
                state = ViewGroup.ENABLED_STATE_SET;
            }
            else {
                state = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(state);
        }
    }
    
    public final void m() {
        int[] array;
        if (((View)this.f).hasFocus()) {
            array = ViewGroup.FOCUSED_STATE_SET;
        }
        else {
            array = ViewGroup.EMPTY_STATE_SET;
        }
        final Drawable background = this.h.getBackground();
        if (background != null) {
            background.setState(array);
        }
        final Drawable background2 = this.i.getBackground();
        if (background2 != null) {
            background2.setState(array);
        }
        ((View)this).invalidate();
    }
    
    public final void n() {
        final CharSequence queryHint = this.getQueryHint();
        final SearchAutoComplete f = this.f;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        Object hint = charSequence;
        if (this.D) {
            if (this.u == null) {
                hint = charSequence;
            }
            else {
                final int n = (int)(((TextView)f).getTextSize() * 1.25);
                this.u.setBounds(0, 0, n, n);
                hint = new SpannableStringBuilder((CharSequence)"   ");
                ((SpannableStringBuilder)hint).setSpan((Object)new ImageSpan(this.u), 1, 2, 33);
                ((SpannableStringBuilder)hint).append(charSequence);
            }
        }
        ((TextView)f).setHint((CharSequence)hint);
    }
    
    public final void o() {
        final boolean g = this.G;
        final int n = 0;
        int visibility = 0;
        Label_0066: {
            if ((g || this.L) && !this.E) {
                visibility = n;
                if (((View)this.k).getVisibility() == 0) {
                    break Label_0066;
                }
                if (((View)this.m).getVisibility() == 0) {
                    visibility = n;
                    break Label_0066;
                }
            }
            visibility = 8;
        }
        this.i.setVisibility(visibility);
    }
    
    @Override
    public final void onActionViewCollapsed() {
        ((TextView)this.f).setText((CharSequence)"");
        final SearchAutoComplete f = this.f;
        ((EditText)f).setSelection(((TextView)f).length());
        this.N = "";
        this.clearFocus();
        this.q(true);
        ((TextView)this.f).setImeOptions(this.P);
        this.O = false;
    }
    
    @Override
    public final void onActionViewExpanded() {
        if (this.O) {
            return;
        }
        this.O = true;
        final int imeOptions = ((TextView)this.f).getImeOptions();
        this.P = imeOptions;
        ((TextView)this.f).setImeOptions(imeOptions | 0x2000000);
        ((TextView)this.f).setText((CharSequence)"");
        this.setIconified(false);
    }
    
    public final void onDetachedFromWindow() {
        ((View)this).removeCallbacks((Runnable)this.S);
        ((View)this).post((Runnable)this.T);
        super.onDetachedFromWindow();
    }
    
    @Override
    public final void onLayout(final boolean b, int n, final int n2, int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            final SearchAutoComplete f = this.f;
            final Rect p5 = this.p;
            ((View)f).getLocationInWindow(this.r);
            ((View)this).getLocationInWindow(this.s);
            final int[] r = this.r;
            n = r[1];
            final int[] s = this.s;
            n3 = n - s[1];
            n = r[0] - s[0];
            p5.set(n, n3, ((View)f).getWidth() + n, ((View)f).getHeight() + n3);
            final Rect q = this.q;
            final Rect p6 = this.p;
            q.set(p6.left, 0, p6.right, n4 - n2);
            final q o = this.o;
            if (o == null) {
                ((View)this).setTouchDelegate((TouchDelegate)(this.o = new q(this.q, this.p, this.f)));
            }
            else {
                final Rect q2 = this.q;
                final Rect p7 = this.p;
                o.b.set(q2);
                o.d.set(q2);
                final Rect d = o.d;
                n = -o.e;
                d.inset(n, n);
                o.c.set(p7);
            }
        }
    }
    
    @Override
    public final void onMeasure(int n, int n2) {
        if (this.E) {
            super.onMeasure(n, n2);
            return;
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    n = size;
                }
                else {
                    final int k = this.K;
                    n = size;
                    if (k > 0) {
                        n = Math.min(k, size);
                    }
                }
            }
            else {
                n = this.K;
                if (n <= 0) {
                    n = this.getPreferredWidth();
                }
            }
        }
        else {
            n = this.K;
            if (n > 0) {
                n = Math.min(n, size);
            }
            else {
                n = Math.min(this.getPreferredWidth(), size);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n2);
        n2 = View$MeasureSpec.getSize(n2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                n2 = this.getPreferredHeight();
            }
        }
        else {
            n2 = Math.min(this.getPreferredHeight(), n2);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final p p = (p)parcelable;
        super.onRestoreInstanceState(p.f);
        this.q(p.h);
        ((View)this).requestLayout();
    }
    
    public final Parcelable onSaveInstanceState() {
        final p p = new p(super.onSaveInstanceState());
        p.h = this.E;
        return (Parcelable)p;
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        ((View)this).post((Runnable)this.S);
    }
    
    public final void p(final boolean b) {
        final boolean g = this.G;
        final int n = 0;
        int visibility = 0;
        Label_0074: {
            if (g && ((g || this.L) && !this.E) && ((View)this).hasFocus()) {
                visibility = n;
                if (b) {
                    break Label_0074;
                }
                if (!this.L) {
                    visibility = n;
                    break Label_0074;
                }
            }
            visibility = 8;
        }
        this.k.setVisibility(visibility);
    }
    
    public final void q(final boolean e) {
        this.E = e;
        final int n = 8;
        int visibility;
        if (e) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        final boolean b = TextUtils.isEmpty((CharSequence)((EditText)this.f).getText()) ^ true;
        this.j.setVisibility(visibility);
        this.p(b);
        final View g = this.g;
        int visibility2;
        if (e) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        g.setVisibility(visibility2);
        int visibility3;
        if (this.t.getDrawable() != null && !this.D) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        this.t.setVisibility(visibility3);
        this.l();
        int visibility4 = n;
        if (this.L) {
            visibility4 = n;
            if (!this.E) {
                visibility4 = n;
                if (b ^ true) {
                    this.k.setVisibility(8);
                    visibility4 = 0;
                }
            }
        }
        this.m.setVisibility(visibility4);
        this.o();
    }
    
    public final boolean requestFocus(final int n, final Rect rect) {
        if (this.J) {
            return false;
        }
        if (!((View)this).isFocusable()) {
            return false;
        }
        if (!this.E) {
            final boolean requestFocus = ((View)this.f).requestFocus(n, rect);
            if (requestFocus) {
                this.q(false);
            }
            return requestFocus;
        }
        return super.requestFocus(n, rect);
    }
    
    public void setAppSearchData(final Bundle r) {
        this.R = r;
    }
    
    public void setIconified(final boolean b) {
        if (b) {
            this.g();
        }
        else {
            this.q(false);
            ((View)this.f).requestFocus();
            this.f.setImeVisibility(true);
            final View$OnClickListener c = this.C;
            if (c != null) {
                c.onClick((View)this);
            }
        }
    }
    
    public void setIconifiedByDefault(final boolean d) {
        if (this.D == d) {
            return;
        }
        this.q(this.D = d);
        this.n();
    }
    
    public void setImeOptions(final int imeOptions) {
        ((TextView)this.f).setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        ((TextView)this.f).setInputType(inputType);
    }
    
    public void setMaxWidth(final int k) {
        this.K = k;
        ((View)this).requestLayout();
    }
    
    public void setOnCloseListener(final l l) {
    }
    
    public void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener b) {
        this.B = b;
    }
    
    public void setOnQueryTextListener(final m a) {
        this.A = a;
    }
    
    public void setOnSearchClickListener(final View$OnClickListener c) {
        this.C = c;
    }
    
    public void setOnSuggestionListener(final n n) {
    }
    
    public void setQueryHint(final CharSequence h) {
        this.H = h;
        this.n();
    }
    
    public void setQueryRefinementEnabled(final boolean i) {
        this.I = i;
        final f4.a f = this.F;
        if (f instanceof t0) {
            final t0 t0 = (t0)f;
            int u;
            if (i) {
                u = 2;
            }
            else {
                u = 1;
            }
            t0.u = u;
        }
    }
    
    public void setSearchableInfo(SearchableInfo q) {
        this.Q = q;
        boolean l = true;
        final Intent intent = null;
        if (q != null) {
            this.f.setThreshold(q.getSuggestThreshold());
            ((TextView)this.f).setImeOptions(this.Q.getImeOptions());
            int inputType;
            final int n = inputType = this.Q.getInputType();
            if ((n & 0xF) == 0x1) {
                inputType = (n & 0xFFFEFFFF);
                if (this.Q.getSuggestAuthority() != null) {
                    inputType = (inputType | 0x10000 | 0x80000);
                }
            }
            ((TextView)this.f).setInputType(inputType);
            final f4.a f = this.F;
            if (f != null) {
                f.c(null);
            }
            if (this.Q.getSuggestAuthority() != null) {
                final t0 t0 = new t0(((View)this).getContext(), this, this.Q, this.U);
                this.F = t0;
                this.f.setAdapter((ListAdapter)t0);
                final t0 t2 = (t0)this.F;
                int u;
                if (this.I) {
                    u = 2;
                }
                else {
                    u = 1;
                }
                t2.u = u;
            }
            this.n();
        }
        q = this.Q;
        Label_0272: {
            if (q != null && q.getVoiceSearchEnabled()) {
                Intent intent2;
                if (this.Q.getVoiceSearchLaunchWebSearch()) {
                    intent2 = this.x;
                }
                else {
                    intent2 = intent;
                    if (this.Q.getVoiceSearchLaunchRecognizer()) {
                        intent2 = this.y;
                    }
                }
                if (intent2 != null && ((View)this).getContext().getPackageManager().resolveActivity(intent2, 65536) != null) {
                    break Label_0272;
                }
            }
            l = false;
        }
        this.L = l;
        if (l) {
            ((TextView)this.f).setPrivateImeOptions("nm");
        }
        this.q(this.E);
    }
    
    public void setSubmitButtonEnabled(final boolean g) {
        this.G = g;
        this.q(this.E);
    }
    
    public void setSuggestionsAdapter(final f4.a a) {
        this.F = a;
        this.f.setAdapter((ListAdapter)a);
    }
    
    public static class SearchAutoComplete extends d
    {
        public int j;
        public SearchView k;
        public boolean l;
        public final SearchView$SearchAutoComplete$a m;
        
        public SearchAutoComplete(final Context context, final AttributeSet set) {
            super(context, set, 0);
            this.m = new Runnable() {
                @Override
                public final void run() {
                    final SearchAutoComplete f = SearchAutoComplete.this;
                    if (f.l) {
                        ((InputMethodManager)((View)f).getContext().getSystemService("input_method")).showSoftInput((View)f, 0);
                        f.l = false;
                    }
                }
            };
            this.j = this.getThreshold();
        }
        
        private int getSearchViewTextMinWidthDp() {
            final Configuration configuration = ((View)this).getResources().getConfiguration();
            final int screenWidthDp = configuration.screenWidthDp;
            final int screenHeightDp = configuration.screenHeightDp;
            if (screenWidthDp >= 960 && screenHeightDp >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (screenWidthDp < 600 && (screenWidthDp < 640 || screenHeightDp < 480)) {
                return 160;
            }
            return 192;
        }
        
        public final void a() {
            Method c;
            if (Build$VERSION.SDK_INT >= 29) {
                SearchView.k.b(this, 1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                }
                return;
            }
            else {
                final o a0 = SearchView.a0;
                a0.getClass();
                SearchView.o.a();
                c = a0.c;
                if (c == null) {
                    return;
                }
            }
            try {
                c.invoke(this, Boolean.TRUE);
            }
            catch (final Exception ex) {}
        }
        
        public final boolean enoughToFilter() {
            return this.j <= 0 || super.enoughToFilter();
        }
        
        @Override
        public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
            final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.l) {
                ((View)this).removeCallbacks((Runnable)this.m);
                ((View)this).post((Runnable)this.m);
            }
            return onCreateInputConnection;
        }
        
        public final void onFinishInflate() {
            super.onFinishInflate();
            ((TextView)this).setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), ((View)this).getResources().getDisplayMetrics()));
        }
        
        public final void onFocusChanged(final boolean b, final int n, final Rect rect) {
            super.onFocusChanged(b, n, rect);
            final SearchView k = this.k;
            k.q(k.E);
            ((View)k).post((Runnable)k.S);
            if (((View)k.f).hasFocus()) {
                k.f();
            }
        }
        
        public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
            if (n == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    final KeyEvent$DispatcherState keyDispatcherState = ((View)this).getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, (Object)this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    final KeyEvent$DispatcherState keyDispatcherState2 = ((View)this).getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.k.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(n, keyEvent);
        }
        
        public final void onWindowFocusChanged(final boolean b) {
            super.onWindowFocusChanged(b);
            if (b && ((View)this.k).hasFocus() && ((View)this).getVisibility() == 0) {
                boolean b2 = true;
                this.l = true;
                final Context context = ((View)this).getContext();
                final o a0 = SearchView.a0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    b2 = false;
                }
                if (b2) {
                    this.a();
                }
            }
        }
        
        public final void performCompletion() {
        }
        
        public final void replaceText(final CharSequence charSequence) {
        }
        
        public void setImeVisibility(final boolean b) {
            final InputMethodManager inputMethodManager = (InputMethodManager)((View)this).getContext().getSystemService("input_method");
            if (!b) {
                this.l = false;
                ((View)this).removeCallbacks((Runnable)this.m);
                inputMethodManager.hideSoftInputFromWindow(((View)this).getWindowToken(), 0);
                return;
            }
            if (inputMethodManager.isActive((View)this)) {
                this.l = false;
                ((View)this).removeCallbacks((Runnable)this.m);
                inputMethodManager.showSoftInput((View)this, 0);
                return;
            }
            this.l = true;
        }
        
        public void setSearchView(final SearchView k) {
            this.k = k;
        }
        
        public void setThreshold(final int n) {
            super.setThreshold(n);
            this.j = n;
        }
    }
    
    public static final class k
    {
        public static void a(final AutoCompleteTextView autoCompleteTextView) {
            c2.k(autoCompleteTextView);
        }
        
        public static void b(final SearchAutoComplete searchAutoComplete, final int inputMethodMode) {
            searchAutoComplete.setInputMethodMode(inputMethodMode);
        }
    }
    
    public interface l
    {
        boolean E0();
    }
    
    public interface m
    {
        void a(final String p0);
        
        void b(final String p0);
    }
    
    public interface n
    {
        boolean a();
        
        boolean b();
    }
    
    public static final class o
    {
        public Method a;
        public Method b;
        public Method c;
        
        public o() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: aconst_null    
            //     6: putfield        androidx/appcompat/widget/SearchView$o.a:Ljava/lang/reflect/Method;
            //     9: aload_0        
            //    10: aconst_null    
            //    11: putfield        androidx/appcompat/widget/SearchView$o.b:Ljava/lang/reflect/Method;
            //    14: aload_0        
            //    15: aconst_null    
            //    16: putfield        androidx/appcompat/widget/SearchView$o.c:Ljava/lang/reflect/Method;
            //    19: invokestatic    androidx/appcompat/widget/SearchView$o.a:()V
            //    22: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    24: ldc             "doBeforeTextChanged"
            //    26: iconst_0       
            //    27: anewarray       Ljava/lang/Class;
            //    30: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    33: astore_1       
            //    34: aload_0        
            //    35: aload_1        
            //    36: putfield        androidx/appcompat/widget/SearchView$o.a:Ljava/lang/reflect/Method;
            //    39: aload_1        
            //    40: iconst_1       
            //    41: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    44: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    46: ldc             "doAfterTextChanged"
            //    48: iconst_0       
            //    49: anewarray       Ljava/lang/Class;
            //    52: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    55: astore_1       
            //    56: aload_0        
            //    57: aload_1        
            //    58: putfield        androidx/appcompat/widget/SearchView$o.b:Ljava/lang/reflect/Method;
            //    61: aload_1        
            //    62: iconst_1       
            //    63: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    66: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    68: ldc             "ensureImeVisible"
            //    70: iconst_1       
            //    71: anewarray       Ljava/lang/Class;
            //    74: dup            
            //    75: iconst_0       
            //    76: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //    79: aastore        
            //    80: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    83: astore_1       
            //    84: aload_0        
            //    85: aload_1        
            //    86: putfield        androidx/appcompat/widget/SearchView$o.c:Ljava/lang/reflect/Method;
            //    89: aload_1        
            //    90: iconst_1       
            //    91: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    94: return         
            //    95: astore_1       
            //    96: goto            44
            //    99: astore_1       
            //   100: goto            66
            //   103: astore_1       
            //   104: goto            94
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  22     44     95     99     Ljava/lang/NoSuchMethodException;
            //  44     66     99     103    Ljava/lang/NoSuchMethodException;
            //  66     94     103    107    Ljava/lang/NoSuchMethodException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public static void a() {
            if (Build$VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
    
    public static final class p extends h4.a
    {
        public static final Parcelable$Creator<p> CREATOR;
        public boolean h;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<p>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new p(parcel, null);
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    return new p(parcel, classLoader);
                }
                
                public final Object[] newArray(final int n) {
                    return new p[n];
                }
            };
        }
        
        public p(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = (boolean)parcel.readValue((ClassLoader)null);
        }
        
        public p(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public final String toString() {
            final StringBuilder k = a.k("SearchView.SavedState{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append(" isIconified=");
            k.append(this.h);
            k.append("}");
            return k.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeValue((Object)this.h);
        }
    }
    
    public static final class q extends TouchDelegate
    {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;
        
        public q(final Rect rect, final Rect rect2, final SearchAutoComplete a) {
            super(rect, (View)a);
            final int scaledTouchSlop = ViewConfiguration.get(((View)a).getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            final Rect b = new Rect();
            this.b = b;
            final Rect d = new Rect();
            this.d = d;
            final Rect c = new Rect();
            this.c = c;
            b.set(rect);
            d.set(rect);
            final int n = -scaledTouchSlop;
            d.inset(n, n);
            c.set(rect2);
            this.a = (View)a;
        }
        
        public final boolean onTouchEvent(final MotionEvent motionEvent) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            final int action = motionEvent.getAction();
            int f = 1;
            final boolean b = false;
            boolean b2 = false;
            Label_0140: {
                Label_0134: {
                    if (action != 0) {
                        if (action != 1 && action != 2) {
                            if (action != 3) {
                                break Label_0134;
                            }
                            f = (this.f ? 1 : 0);
                            this.f = false;
                        }
                        else {
                            final boolean f2 = this.f;
                            if ((f = (f2 ? 1 : 0)) != 0) {
                                f = (f2 ? 1 : 0);
                                if (!this.d.contains(n, n2)) {
                                    f = (f2 ? 1 : 0);
                                    b2 = false;
                                    break Label_0140;
                                }
                            }
                        }
                        b2 = true;
                        break Label_0140;
                    }
                    if (this.b.contains(n, n2)) {
                        this.f = true;
                        b2 = true;
                        break Label_0140;
                    }
                }
                b2 = true;
                f = 0;
            }
            boolean dispatchTouchEvent = b;
            if (f != 0) {
                if (b2 && !this.c.contains(n, n2)) {
                    motionEvent.setLocation((float)(this.a.getWidth() / 2), (float)(this.a.getHeight() / 2));
                }
                else {
                    final Rect c = this.c;
                    motionEvent.setLocation((float)(n - c.left), (float)(n2 - c.top));
                }
                dispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
            }
            return dispatchTouchEvent;
        }
    }
}
