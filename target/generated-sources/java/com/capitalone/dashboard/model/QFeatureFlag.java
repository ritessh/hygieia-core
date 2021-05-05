package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeatureFlag is a Querydsl query type for FeatureFlag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeatureFlag extends EntityPathBase<FeatureFlag> {

    private static final long serialVersionUID = -1034927520L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeatureFlag featureFlag = new QFeatureFlag("featureFlag");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final StringPath description = createString("description");

    public final MapPath<String, Boolean, BooleanPath> flags = this.<String, Boolean, BooleanPath>createMap("flags", String.class, Boolean.class, BooleanPath.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QFeatureFlag(String variable) {
        this(FeatureFlag.class, forVariable(variable), INITS);
    }

    public QFeatureFlag(Path<? extends FeatureFlag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFeatureFlag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFeatureFlag(PathMetadata metadata, PathInits inits) {
        this(FeatureFlag.class, metadata, inits);
    }

    public QFeatureFlag(Class<? extends FeatureFlag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

