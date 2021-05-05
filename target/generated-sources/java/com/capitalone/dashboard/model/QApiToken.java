package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApiToken is a Querydsl query type for ApiToken
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QApiToken extends EntityPathBase<ApiToken> {

    private static final long serialVersionUID = -1705284127L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApiToken apiToken = new QApiToken("apiToken");

    public final QBaseModel _super;

    public final StringPath apiKey = createString("apiKey");

    public final StringPath apiUser = createString("apiUser");

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Long> expirationDt = createNumber("expirationDt", Long.class);

    public final BooleanPath hashed = createBoolean("hashed");

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QApiToken(String variable) {
        this(ApiToken.class, forVariable(variable), INITS);
    }

    public QApiToken(Path<? extends ApiToken> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QApiToken(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QApiToken(PathMetadata metadata, PathInits inits) {
        this(ApiToken.class, metadata, inits);
    }

    public QApiToken(Class<? extends ApiToken> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

