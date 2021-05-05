package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCodeReposBuilds is a Querydsl query type for CodeReposBuilds
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCodeReposBuilds extends EntityPathBase<CodeReposBuilds> {

    private static final long serialVersionUID = 1547560471L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCodeReposBuilds codeReposBuilds = new QCodeReposBuilds("codeReposBuilds");

    public final QBaseModel _super;

    public final SetPath<org.bson.types.ObjectId, org.bson.types.QObjectId> buildCollectorItems = this.<org.bson.types.ObjectId, org.bson.types.QObjectId>createSet("buildCollectorItems", org.bson.types.ObjectId.class, org.bson.types.QObjectId.class, PathInits.DIRECT2);

    //inherited
    public final StringPath clientReference;

    public final StringPath codeRepo = createString("codeRepo");

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QCodeReposBuilds(String variable) {
        this(CodeReposBuilds.class, forVariable(variable), INITS);
    }

    public QCodeReposBuilds(Path<? extends CodeReposBuilds> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCodeReposBuilds(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCodeReposBuilds(PathMetadata metadata, PathInits inits) {
        this(CodeReposBuilds.class, metadata, inits);
    }

    public QCodeReposBuilds(Class<? extends CodeReposBuilds> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

