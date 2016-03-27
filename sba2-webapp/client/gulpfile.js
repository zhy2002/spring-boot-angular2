
///////////////////////// Gulp components /////////////////////////////////
var del = require('del');
var glob = require("glob");
var gulp = require('gulp');
var config = require('./gulpfile.config');
var $ = require('gulp-load-plugins')({lazy: true});
var yargs = require('yargs');

///////////////////////// Config //////////////////////////////////////////

///////////////////////// Tasks ///////////////////////////////////////////
gulp.task('default', ['help']);

gulp.task('help', $.taskListing);

gulp.task('build-dev', function(){
    console.log('building dev');
    gulp
        .src('./src/index.html')
        .pipe(gulp.dest(config.distFolder));
});

////////////////////////// Utilities //////////////////////////////////////
function clean(path, done) {
    console.log('Cleaning: ' + $.util.colors.blue(path));
    del.sync(path);
    done();
}

function batchReplace(array, searchvalue, newvalue) {
    var result = [];
    for(var i=0; i<array.length; i++){
        result.push(array[i].replace(searchvalue, newvalue));
    }
    return result;
}