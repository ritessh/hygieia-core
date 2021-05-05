package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QReview extends BeanPath<Review> {

    private static final long serialVersionUID = 1512039866L;

    public static final QReview review = new QReview("review");

    public final StringPath author = createString("author");

    public final StringPath authorLDAPDN = createString("authorLDAPDN");

    public final StringPath authorType = createString("authorType");

    public final StringPath body = createString("body");

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final StringPath state = createString("state");

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    public QReview(String variable) {
        super(Review.class, forVariable(variable));
    }

    public QReview(Path<? extends Review> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReview(PathMetadata metadata) {
        super(Review.class, metadata);
    }

}

