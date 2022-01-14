import Moviecard from "Components/MovieCard";
import Pagination from "Components/pagination";

function Listing() {
  return (
    <>
      <Pagination />
      <div className="container">
        <div className="row">
          <div className="col-sm-6 col-lg-4">
            <Moviecard />
          </div>
        </div>
        <div className="row">
          <div className="col-sm-6 col-lg-4">
            <Moviecard />
          </div>
        </div><div className="row">
          <div className="col-sm-6 col-lg-4">
            <Moviecard />
          </div>
        </div><div className="row">
          <div className="col-sm-6 col-lg-4">
            <Moviecard />
          </div>
        </div><div className="row">
          <div className="col-sm-6 col-lg-4">
            <Moviecard />
          </div>
        </div>
      </div>
    </>
  );
}
export default Listing;
