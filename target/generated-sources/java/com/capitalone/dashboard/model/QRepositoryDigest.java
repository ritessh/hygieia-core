package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRepositoryDigest is a Querydsl query type for RepositoryDigest
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QRepositoryDigest extends BeanPath<RepositoryDigest> {

    private static final long serialVersionUID = -1936645744L;

    public static final QRepositoryDigest repositoryDigest = new QRepositoryDigest("repositoryDigest");

    public final StringPath digest = createString("digest");

    public final StringPath registry = createString("registry");

    public final StringPath repository = createString("repository");

    public QRepositoryDigest(String variable) {
        super(RepositoryDigest.class, forVariable(variable));
    }

    public QRepositoryDigest(Path<? extends RepositoryDigest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRepositoryDigest(PathMetadata metadata) {
        super(RepositoryDigest.class, metadata);
    }

}

