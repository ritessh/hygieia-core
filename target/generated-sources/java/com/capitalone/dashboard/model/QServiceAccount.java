package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceAccount is a Querydsl query type for ServiceAccount
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServiceAccount extends EntityPathBase<ServiceAccount> {

    private static final long serialVersionUID = 1669841434L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceAccount serviceAccount = new QServiceAccount("serviceAccount");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final StringPath fileNames = createString("fileNames");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath serviceAccountName = createString("serviceAccountName");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QServiceAccount(String variable) {
        this(ServiceAccount.class, forVariable(variable), INITS);
    }

    public QServiceAccount(Path<? extends ServiceAccount> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceAccount(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceAccount(PathMetadata metadata, PathInits inits) {
        this(ServiceAccount.class, metadata, inits);
    }

    public QServiceAccount(Class<? extends ServiceAccount> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

