package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthentication is a Querydsl query type for Authentication
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuthentication extends EntityPathBase<Authentication> {

    private static final long serialVersionUID = 1021136602L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuthentication authentication = new QAuthentication("authentication");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final BooleanPath hashed = createBoolean("hashed");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath password = createString("password");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath username = createString("username");

    public QAuthentication(String variable) {
        this(Authentication.class, forVariable(variable), INITS);
    }

    public QAuthentication(Path<? extends Authentication> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuthentication(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuthentication(PathMetadata metadata, PathInits inits) {
        this(Authentication.class, metadata, inits);
    }

    public QAuthentication(Class<? extends Authentication> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

