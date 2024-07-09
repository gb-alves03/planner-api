CREATE TABLE trips (
    id UUID PRIMARY KEY,
    destination VARCHAR(255) NOT NULL,
    starts_at TIMESTAMP WITHOUT TIME ZONE,
    ends_at TIMESTAMP WITHOUT TIME ZONE,
    is_confirmed BOOLEAN NOT NULL,
    owner_name VARCHAR(255) NOT NULL,
    owner_email VARCHAR(255) NOT NULL
);