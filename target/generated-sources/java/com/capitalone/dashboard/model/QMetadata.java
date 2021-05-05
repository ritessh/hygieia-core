package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMetadata is a Querydsl query type for Metadata
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMetadata extends EntityPathBase<Metadata> {

    private static final long serialVersionUID = 1182554385L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMetadata metadata = new QMetadata("metadata");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath key = createString("key");

    public final SimplePath<Object> rawData = createSimple("rawData", Object.class);

    public final StringPath source = createString("source");

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QMetadata(String variable) {
        this(Metadata.class, forVariable(variable), INITS);
    }

    public QMetadata(Path<? extends Metadata> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMetadata(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMetadata(PathMetadata metadata, PathInits inits) {
        this(Metadata.class, metadata, inits);
    }

    public QMetadata(Class<? extends Metadata> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

