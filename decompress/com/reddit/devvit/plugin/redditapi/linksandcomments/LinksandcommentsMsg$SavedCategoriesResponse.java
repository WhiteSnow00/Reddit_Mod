// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

import com.google.protobuf.GeneratedMessageLite$b;
import t5.w;
import com.google.protobuf.StringValue;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class LinksandcommentsMsg$SavedCategoriesResponse extends GeneratedMessageLite<LinksandcommentsMsg$SavedCategoriesResponse, a> implements d1
{
    public static final int CATEGORIES_FIELD_NUMBER = 1;
    private static final LinksandcommentsMsg$SavedCategoriesResponse DEFAULT_INSTANCE;
    private static volatile n1<LinksandcommentsMsg$SavedCategoriesResponse> PARSER;
    private Internal$j<Category> categories_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SavedCategoriesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SavedCategoriesResponse()));
    }
    
    private LinksandcommentsMsg$SavedCategoriesResponse() {
        this.categories_ = (Internal$j<Category>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse access$27500() {
        return LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$27600(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse, final int n, final Category category) {
        linksandcommentsMsg$SavedCategoriesResponse.setCategories(n, category);
    }
    
    public static void access$27700(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse, final Category category) {
        linksandcommentsMsg$SavedCategoriesResponse.addCategories(category);
    }
    
    public static void access$27800(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse, final int n, final Category category) {
        linksandcommentsMsg$SavedCategoriesResponse.addCategories(n, category);
    }
    
    public static void access$27900(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse, final Iterable iterable) {
        linksandcommentsMsg$SavedCategoriesResponse.addAllCategories(iterable);
    }
    
    public static void access$28000(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse) {
        linksandcommentsMsg$SavedCategoriesResponse.clearCategories();
    }
    
    public static void access$28100(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse, final int n) {
        linksandcommentsMsg$SavedCategoriesResponse.removeCategories(n);
    }
    
    private void addAllCategories(final Iterable<? extends Category> iterable) {
        this.ensureCategoriesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.categories_);
    }
    
    private void addCategories(final int n, final Category category) {
        category.getClass();
        this.ensureCategoriesIsMutable();
        ((List<Category>)this.categories_).add(n, category);
    }
    
    private void addCategories(final Category category) {
        category.getClass();
        this.ensureCategoriesIsMutable();
        ((List<Category>)this.categories_).add(category);
    }
    
    private void clearCategories() {
        this.categories_ = (Internal$j<Category>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureCategoriesIsMutable() {
        final Internal$j<Category> categories_ = this.categories_;
        if (!categories_.E0()) {
            this.categories_ = (Internal$j<Category>)GeneratedMessageLite.mutableCopy((Internal$j)categories_);
        }
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse getDefaultInstance() {
        return LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SavedCategoriesResponse linksandcommentsMsg$SavedCategoriesResponse) {
        return (a)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SavedCategoriesResponse);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SavedCategoriesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SavedCategoriesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SavedCategoriesResponse> parser() {
        return (n1<LinksandcommentsMsg$SavedCategoriesResponse>)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeCategories(final int n) {
        this.ensureCategoriesIsMutable();
        this.categories_.remove(n);
    }
    
    private void setCategories(final int n, final Category category) {
        category.getClass();
        this.ensureCategoriesIsMutable();
        ((List<Category>)this.categories_).set(n, category);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final n1<LinksandcommentsMsg$SavedCategoriesResponse> parser;
                if ((parser = LinksandcommentsMsg$SavedCategoriesResponse.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SavedCategoriesResponse.class) {
                        if (LinksandcommentsMsg$SavedCategoriesResponse.PARSER == null) {
                            LinksandcommentsMsg$SavedCategoriesResponse.PARSER = (n1<LinksandcommentsMsg$SavedCategoriesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SavedCategoriesResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "categories_", Category.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SavedCategoriesResponse();
            }
        }
    }
    
    public Category getCategories(final int n) {
        return ((List<Category>)this.categories_).get(n);
    }
    
    public int getCategoriesCount() {
        return ((List)this.categories_).size();
    }
    
    public List<Category> getCategoriesList() {
        return (List<Category>)this.categories_;
    }
    
    public LinksandcommentsMsg$SavedCategoriesResponse$b getCategoriesOrBuilder(final int n) {
        return ((List<LinksandcommentsMsg$SavedCategoriesResponse$b>)this.categories_).get(n);
    }
    
    public List<? extends LinksandcommentsMsg$SavedCategoriesResponse$b> getCategoriesOrBuilderList() {
        return (List<? extends LinksandcommentsMsg$SavedCategoriesResponse$b>)this.categories_;
    }
    
    public static final class Category extends GeneratedMessageLite<Category, Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a> implements LinksandcommentsMsg$SavedCategoriesResponse$b
    {
        public static final int CATEGORY_FIELD_NUMBER = 1;
        private static final Category DEFAULT_INSTANCE;
        private static volatile n1<Category> PARSER;
        private StringValue category_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)Category.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Category()));
        }
        
        private Category() {
        }
        
        public static Category access$27000() {
            return Category.DEFAULT_INSTANCE;
        }
        
        public static void access$27100(final Category category, final StringValue category2) {
            category.setCategory(category2);
        }
        
        public static void access$27200(final Category category, final StringValue stringValue) {
            category.mergeCategory(stringValue);
        }
        
        public static void access$27300(final Category category) {
            category.clearCategory();
        }
        
        private void clearCategory() {
            this.category_ = null;
        }
        
        public static Category getDefaultInstance() {
            return Category.DEFAULT_INSTANCE;
        }
        
        private void mergeCategory(final StringValue category_) {
            category_.getClass();
            final StringValue category_2 = this.category_;
            if (category_2 != null && category_2 != StringValue.getDefaultInstance()) {
                this.category_ = (StringValue)w.e(this.category_, category_);
            }
            else {
                this.category_ = category_;
            }
        }
        
        public static Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a newBuilder() {
            return (Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a)Category.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a newBuilder(final Category category) {
            return (Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a)Category.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)category);
        }
        
        public static Category parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (Category)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Category parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Category)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Category parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, byteString);
        }
        
        public static Category parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static Category parseFrom(final l l) throws IOException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, l);
        }
        
        public static Category parseFrom(final l l, final d0 d0) throws IOException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, l, d0);
        }
        
        public static Category parseFrom(final InputStream inputStream) throws IOException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Category parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Category parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static Category parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static Category parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, array);
        }
        
        public static Category parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (Category)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Category.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<Category> parser() {
            return (n1<Category>)Category.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setCategory(final StringValue category_) {
            category_.getClass();
            this.category_ = category_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final n1<Category> parser;
                    if ((parser = Category.PARSER) == null) {
                        synchronized (Category.class) {
                            if (Category.PARSER == null) {
                                Category.PARSER = (n1<Category>)new GeneratedMessageLite$c((GeneratedMessageLite)Category.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return Category.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)Category.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "category_" });
                }
                case 2: {
                    return new Category.LinksandcommentsMsg$SavedCategoriesResponse$Category$a();
                }
                case 1: {
                    return new Category();
                }
            }
        }
        
        public StringValue getCategory() {
            StringValue stringValue;
            if ((stringValue = this.category_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasCategory() {
            return this.category_ != null;
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SavedCategoriesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SavedCategoriesResponse.access$27500());
        }
    }
}
