qpackage Solution;
use strict;
use warnings;

sub quarter_of {
    my ($month) = @_;
    return int(($month-1)/3)+1; # Your code here
}

1;